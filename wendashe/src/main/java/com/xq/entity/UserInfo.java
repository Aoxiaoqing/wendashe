package com.xq.entity;

import lombok.Data;

@Data
public class UserInfo {
    private Integer user_id;
    private String account;
    private String password;
    private Integer personal_id;
}
