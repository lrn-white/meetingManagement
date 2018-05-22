package com.liu.meetingmanagement.meetingroom.dao;

import com.liu.meetingmanagement.meetingroom.model.MeetingRoom;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Vector;

/**
 * 会议室dao层
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

    /**
     * 获得会议室数量
     * @author 刘仁楠
     * @date 2018/5/17 16:21
     */
    public Integer countMeetingRoom();

    /**
     * 根据roomID删除会议室
     * @author 刘仁楠
     * @date 2018/5/17 17:04
     */
    public int deleteMeetingRoomByRoomID(int roomID);

    /**
     * 根据roomID获取会议室详情
     * @author 刘仁楠
     * @date 2018/5/18 10:05
     */
    public MeetingRoom getMeetingRoomByRoomID(int roomID);

    /**
     * 根据roomID修改会议室详情
     * @author 刘仁楠
     * @date 2018/5/18 15:17
     */
    public int updateMeetingRoomByRoomID(MeetingRoom meetingRoom);

    /**
     * 新增会议室
     * @author 刘仁楠
     * @date 2018/5/18 16:21
     */
    public int newMeetingRoom(MeetingRoom meetingRoom);

    /**
     * 根据会议室名查询会议室
     * @author 刘仁楠
     * @date 2018/5/21 10:39
     */
    public MeetingRoom getMeetingRoomByRoomName(String roomName);
}
