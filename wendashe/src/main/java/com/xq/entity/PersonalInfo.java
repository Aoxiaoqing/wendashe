package com.xq.entity;

import lombok.Data;

@Data
public class PersonalInfo {
    private Integer personal_id;
    private String username;
    private String synopsis;
    private String avatar;
    private Integer user_id;
    private Integer phone;
    private String email;
    private Integer sex;
    private String interest;
}
