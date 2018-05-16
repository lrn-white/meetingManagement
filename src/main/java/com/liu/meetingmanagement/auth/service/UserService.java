package com.liu.meetingmanagement.auth.service;

import com.liu.meetingmanagement.auth.model.SysUser;

import java.util.Set;

/**
 * @author 刘仁楠
 * @date 2018/5/16 10:08
 */
public interface UserService {

    /**
     * 获取所有用户信息
     * @author 刘仁楠
     * @date 2018/5/16 10:09
     */
    SysUser getUser(SysUser user);

    /**
     * 根据userID获取用户权限
     * @author 刘仁楠
     * @date 2018/5/16 10:09
     */
    Set<String> getResourcesUrlByUserID(int userId);
}
