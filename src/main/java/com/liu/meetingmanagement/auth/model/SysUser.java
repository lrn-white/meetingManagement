package com.liu.meetingmanagement.auth.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户实体类
 * @author 刘仁楠
 * @date 2018/5/16 9:48
 */
@Data
public class SysUser implements Serializable{

    private static final long serialVersionUID = -8753707240787544224L;

    /**
     * 用户ID
     */
    private Integer userID;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
}
