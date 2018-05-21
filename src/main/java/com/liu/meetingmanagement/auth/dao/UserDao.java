package com.liu.meetingmanagement.auth.dao;

import com.liu.meetingmanagement.auth.model.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户dao层
 * @author 刘仁楠
 * @date 2018/5/16 10:26
 */
@Mapper
public interface UserDao {

    /**
     * 判断该用户账号密码是否正确
     * @author 刘仁楠
     * @date 2018/5/16 10:27
     */
    public SysUser getUser(SysUser sysUser);
}
