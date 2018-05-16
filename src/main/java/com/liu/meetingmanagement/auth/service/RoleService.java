package com.liu.meetingmanagement.auth.service;

import java.util.Set;

/**
 * @author 刘仁楠
 * @date 2018/5/16 11:30
 */
public interface RoleService {

    /**
     * 根据userID获得角色名
     * @author 刘仁楠
     * @date 2018/5/16 11:29
     */
    public Set<String> getRoleNameByUserId(Integer userID);
}
