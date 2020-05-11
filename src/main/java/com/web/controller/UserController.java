package com.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.code.kaptcha.Constants;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import com.web.biz.MenuBiz;
import com.web.biz.PositionMenuBiz;
import com.web.biz.UserBiz;
import com.web.entity.TMenu;
import com.web.entity.TUser;
import com.web.entity.TUserExample;
import com.web.entity.TUserExample.Criteria;
import com.web.pojo.MenuPojo;
import com.web.util.DateTimeUtil;

/**
 * 控制层
 * @author ASUS
 *
 */
@Controller
@RequestMapping(value="")
public class UserController {

	@Resource(name="userBizImpl")//注意：首字母应该小写
	UserBiz ub;
	
	@Resource(name="positionMenuBizImpl")
	PositionMenuBiz pmb;
	
	@Resource(name="menuBizImpl")
	MenuBiz mb;
	
	/**
	 * http://localhost:8080/hospitalmanager/user/query.do
	 * @ResponseBody:返回的是json数据
	 * @return
	 */
	@RequestMapping(value="/user/query")
	@ResponseBody
	public List<TUser> query(){
		
//		TUserExample example = new TUserExample();
//		
////		Criteria criteria = example.createCriteria();
////		criteria.andUserNameLike("张%");
//		
//		//查询
//		List<TUser> list = ub.selectByExample(example);
		
		TUser user = new TUser();
		
		List<TUser> list = ub.queryAll(user);
		
		return list;
	}
	
	/**
	 *  http://localhost:8080/hospitalmanager/user/login.do
	 * @param userName
	 * @param userPwd
	 * @param code
	 * @return
	 */
	@RequestMapping(value="/login")
	public ModelAndView  login(String userName,String userPwd,String code,HttpServletRequest req){
		
		ModelAndView mv = new ModelAndView();
		
		//获取Session对象
		HttpSession session = req.getSession();
		
		//获取随机生成的验证码
		String randomCode = session.getAttribute(Constants.KAPTCHA_SESSION_KEY).toString();
		
		//判断验证码输入是否正确
		if(code.equalsIgnoreCase(randomCode)){
			
			//判断用户名和密码输入是否正确
			TUser user = ub.login(userName, userPwd);
			
			if(user != null){
				//用户名和密码输入正确
				
				//得到当前用户的岗位id
				Integer poId = user.getPoId();
				
				//根据岗位id查询对应权限菜单
				List<Integer> ownerList = pmb.selectMenuByPoId(poId);
				
				//查询所有的菜单
				List<TMenu> list = mb.queryByParentId(null);
				
				//匹配权限
				List<MenuPojo> menuList = merge(ownerList,list);
				
				//传递权限菜单数据到主页面
				mv.addObject("menuList", menuList);
				
				mv.setViewName("main");//跳转到主页面
				
			}else{//用户名和密码输入错误
				mv.setViewName("login");//  login.jsp
			}
		}else{
			mv.setViewName("login");//  login.jsp
		}
		
		return mv;
	}
	
	/**
	 * 匹配权限
	 * @param ownerList  权限菜单id集合  [1,3,5,8]
	 * @param list   所有的菜单  [1,2,3,4,5,6,7,8]
	 * @return
	 */
	public List<MenuPojo> merge(List<Integer> ownerList,List<TMenu> list){
		
		List<MenuPojo> menuPojoList = new ArrayList<>();
		
		if(list != null){//判断集合是否为空
			for (TMenu tMenu : list) {
				
				if(hasAuthority(tMenu, ownerList)){//有权限
					MenuPojo mp = new MenuPojo();
					mp.setMenuId(tMenu.getMenuId());
					mp.setHasAuthority(true);
					mp.setIsDelete(tMenu.getIsDelete());
					mp.setMenuImage(tMenu.getMenuImage());
					mp.setMenuLevel(tMenu.getMenuLevel());
					mp.setMenuName(tMenu.getMenuName());
					mp.setMenuSort(tMenu.getMenuSort());
					mp.setMenuUrl(tMenu.getMenuUrl());
					mp.setParentId(tMenu.getParentId());
					
					//递归算法
					mp.setChildMenuPojo(merge(ownerList,tMenu.getChildMenu()));
					
					//把对象一个一个的添加到集合中去
					menuPojoList.add(mp);
				}
			}
		}
		
		return menuPojoList;
	}
	
	/**
	 * 判断是否有权限
	 * @return
	 */
	public boolean hasAuthority(TMenu tMenu,List<Integer> ownerList){
		
		boolean flag = false;
		
		if(ownerList != null){
			for (Integer b : ownerList) {
				if(tMenu.getMenuId() == b){
					flag = true;//有权限
				}
			}
		}
		return flag;//没有权限
	}
	
	/**
//	 * http://localhost:8080/HospitalManager/updateUser.do
	 * @return
	 */
	@RequestMapping(value="/updateUser")
	@ResponseBody//返回的值json格式的数据     json对象
	public TUser   sendUpdate(Integer uid){
		//调用业务逻辑层中的   根据编号查询用户信息方法
		
		TUser user = ub.selectByPrimaryKey(uid);
		
		return user;
	}
	
	/**
	 * 保存修改
	 * @return
	 * @throws java.text.ParseException 
	 */
	@RequestMapping(value="/saveUpdateUser")
	@ResponseBody
	public int updateByPrimaryKey(TUser user,String userBirthdays) throws java.text.ParseException{
		
		try {
			//Date date = (Date) DateTimeUtil.strToDate(userBirthdays);
			
			user.setUserBirthday(DateTimeUtil.strToDate(userBirthdays));
		} catch (ParseException e1) {
			 
			e1.printStackTrace();
		}
		
		System.out.println(user);
		
		try {
			
			ub.updateByPrimaryKey(user);
			
			
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("修改失败");
			return 0;
		}

	}
	
	@RequestMapping(value="/saveAddUser")
	@ResponseBody
	public int insert(TUser user,String userBirthdays)throws java.text.ParseException{
		
		try {
			//Date date = (Date) DateTimeUtil.strToDate(userBirthdays);
			
			user.setUserBirthday(DateTimeUtil.strToDate(userBirthdays));
		} catch (ParseException e1) {
			 
			e1.printStackTrace();
		}
		try{
			ub.insert(user);
			
			
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("修改失败");
			return 0;
		}
	}
	
	@RequestMapping(value="/deleteUser")
	@ResponseBody
	public int deleteByPrimaryKey(Integer uid){
		try{
		ub.deleteByPrimaryKey(uid);
		System.out.println("删除成功");
		return 1;
	}catch(Exception e){
		System.out.print("删除失败");
		return 0;
	}
	
	}
}
