package com.liu.meetingmanagement.auth.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

/**
 * 角色dao层
 * @author 刘仁楠
 * @date 2018/5/16 11:23
 */
@Mapper
public interface RoleDao {

    /**
     * 根据userID获得角色名
     * @author 刘仁楠
     * @date 2018/5/16 11:29
     */
    public Set<String> getRoleNameByUserId(Integer userID);
}
