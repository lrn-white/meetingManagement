package com.liu.meetingmanagement.meetingroom.service;

import java.util.Map;

/**
 * @author 刘仁楠
 * @date 2018/5/15 11:37
 */
public interface MeetingRoomService {

    /**
     * 获得所有会议室信息
     * @author 刘仁楠
     * @date 2018/5/15 11:38
     */
    public Map<String, Object> getAllMeetingRoom(int page, int limit);

    /**
     * 获得会议室数量
     * @author 刘仁楠
     * @date 2018/5/17 16:21
     */
    public Integer countMeetingRoom();

    /**
     * 根据roomID删除会议室
     * @author 刘仁楠
     * @date 2018/5/17 16:58
     */
    public Map<String,Object> deleteMeetingRoomByRoomID(Integer roomID);
}
