package com.xq.service;

import com.xq.entity.UserInfo;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public UserInfo addUser(UserInfo userdaoa, UserInfo userdaop);
}
