package com.liu.meetingmanagement.meetingroom.service;

import com.liu.meetingmanagement.meetingroom.model.MeetingTime;

import java.util.Map;

/**
 * @author 刘仁楠
 * @date 2018/5/21 15:02
 */
public interface MeetingTimeService {

    /**
     * 获取所有开会时间记录
     * @author 刘仁楠
     * @date 2018/5/21 15:02
     */
    public Map<String, Object> getAllMeetingTime();

    /**
     * 获得空闲的会议时间
     * @author 刘仁楠
     * @date 2018/5/21 15:13
     */
    public Map<String, Object> getFreeTime();

    /**
     * 获得某一时间内的所有空闲会议室
     * @author 刘仁楠
     * @date 2018/5/21 16:15
     */
    public Map<String, Object> getFreeRoom(Integer timeID);
}
