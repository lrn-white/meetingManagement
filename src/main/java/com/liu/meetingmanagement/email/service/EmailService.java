package com.liu.meetingmanagement.email.service;

import com.liu.meetingmanagement.meetingroom.model.MeetingRecord;

import java.util.Map;

/**
 * @author 刘仁楠
 * @date 2018/5/31 10:28
 */
public interface EmailService {

    /**
     * 根据用户名查询邮箱
     * @author 刘仁楠
     * @date 2018/5/31 10:27
     */
    public Integer sendGroupEmail(MeetingRecord meetingRecord);
}
