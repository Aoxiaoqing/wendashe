package com.xq.dao;

import com.xq.entity.PersonalInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDao {
    //用户登录后自动查询用户的所有信息
    PersonalInfo selectUserInfo(PersonalInfo personal_id);
    //用户修改自己的个人信息
    PersonalInfo updateUserInfo(PersonalInfo personal_id, PersonalInfo username, PersonalInfo synopsis, PersonalInfo avatar, PersonalInfo phone, PersonalInfo email, PersonalInfo sex, PersonalInfo interest);
}
