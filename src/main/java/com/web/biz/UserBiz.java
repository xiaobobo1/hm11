package com.web.biz;

import java.util.List;

import com.web.entity.TUser;
import com.web.entity.TUserExample;

public interface UserBiz {

	/**
     * 鏍规嵁鏉′欢鏌ヨ
     * @param example
     * @return
     */
    List<TUser> selectByExample(TUserExample example);

    
    /**
     * 鐧诲綍
     * @param userName
     * @param password
     * @return
     */
    public TUser login(String userName,String password);
    
    
    /**
     * 鏍规嵁涓婚敭鏌ヨ瀵硅薄
     * @param userId
     * @return
     */
    TUser selectByPrimaryKey(Integer uid);

    /**
     * 鍏宠仈鏌ヨ
     * @param user
     * @return
     */
    List<TUser>  queryAll(TUser user);
    
    int updateByPrimaryKey(TUser user);
    int deleteByPrimaryKey(Integer userId);
    int  insert(TUser user);
    
    
}
