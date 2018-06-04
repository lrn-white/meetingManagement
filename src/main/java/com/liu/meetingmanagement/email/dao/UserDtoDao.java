package com.liu.meetingmanagement.email.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author 刘仁楠
 * @date 2018/5/31 10:25
 */
@Mapper
public interface UserDtoDao {

    /**
     * 根据用户名查询邮箱
     * @author 刘仁楠
     * @date 2018/5/31 10:27
     */
    public String getEmailByUserName(String userName);

    /**
     * 根据templateID获得模板内容
     * @author 刘仁楠
     * @date 2018/6/4 16:00
     */
    public String getEmailTemplateContent(Integer templateID);
}
