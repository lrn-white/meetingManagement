package com.liu.meetingmanagement.meetingroom.dao;

import com.liu.meetingmanagement.meetingroom.model.MeetingRoom;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 刘仁楠
 * @date 2018/5/15 11:30
 */
@Mapper
public interface MeetingRoomDao {

    /**
     * 获得所有会议室信息
     *
     * @author 刘仁楠
     * @date 2018/5/15 11:36
     */
    public List<MeetingRoom> getAllMeetingRoom();
}
