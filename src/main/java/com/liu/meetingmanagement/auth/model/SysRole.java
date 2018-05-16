package com.liu.meetingmanagement.auth.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 刘仁楠
 * @date 2018/5/16 9:48
 */
@Data
public class SysRole implements Serializable {

    private static final long serialVersionUID = -6708936084116443590L;

    /**
     * 角色ID
     */
    private Integer roleID;
    /**
     * 角色名
     */
    private String roleName;
}
