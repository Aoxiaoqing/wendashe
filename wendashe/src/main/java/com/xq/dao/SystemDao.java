package com.xq.dao;

import com.xq.entity.SystemInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemDao {
    //管理员登录
    SystemInfo login(SystemInfo system_account, SystemInfo system_password);
}
