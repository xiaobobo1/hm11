package com.web.biz.impl;

import java.util.List;

import org.junit.internal.ComparisonCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.biz.UserBiz;
import com.web.dao.TUserMapper;
import com.web.entity.TUser;
import com.web.entity.TUserExample;
import com.web.entity.TUserExample.Criteria;
/**
 * 涓氬姟閫昏緫灞傚疄鐜扮被
 * @author ASUS
 *
 */
@Service
public class UserBizImpl implements UserBiz {
	
	/**
	 * 鑷姩閰嶇疆
	 */
	@Autowired
	TUserMapper tUserMapper;

	@Override
	public List<TUser> selectByExample(TUserExample example) {
		
		return tUserMapper.selectByExample(example);
	}

	@Override
	public TUser login(String userName, String password) {
		
		TUserExample example = new TUserExample();
		Criteria criteria =  example.createCriteria();
		criteria.andUserNameEqualTo(userName);
		criteria.andUserPwdEqualTo(password);
		
		List<TUser> list = tUserMapper.selectByExample(example);
		
		return list.size() > 0 ? list.get(0) : null;
	}

	public TUser selectByPrimaryKey(Integer userId) {
		
		return tUserMapper.selectByPrimaryKey(userId);
	}

	@Override
	public List<TUser> queryAll(TUser user) {
		
		return tUserMapper.queryAll(user);
	}

	@Override
	public int updateByPrimaryKey(TUser user) {
		
		return tUserMapper.updateByPrimaryKey(user);
	}

	@Override
	public int deleteByPrimaryKey(Integer userId) {
		
		return tUserMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public int insert(TUser user) {
		// TODO Auto-generated method stub
		return tUserMapper.insert(user);
	}

}
