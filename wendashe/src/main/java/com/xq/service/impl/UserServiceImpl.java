package com.xq.service.impl;

import lombok.Getter;
import lombok.Setter;
import com.xq.dao.UserDao;
import com.xq.entity.UserInfo;
import com.xq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userdao;

    public UserInfo addUser(UserInfo userdaoa, UserInfo userdaop){
        UserInfo result=userdao.addUser(userdaoa,userdaop);
        return result;
    }
}
