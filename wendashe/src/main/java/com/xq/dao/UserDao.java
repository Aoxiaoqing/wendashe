package com.xq.dao;

import org.springframework.stereotype.Repository;
import com.xq.entity.UserInfo;

@Repository
public interface UserDao {
    //添加用户
    UserInfo addUser(UserInfo account, UserInfo password);
    //查询用户（登录）
    UserInfo queryUser(UserInfo account, UserInfo password);

}
