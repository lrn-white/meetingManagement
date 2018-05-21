package com.liu.meetingmanagement.meetingroom.dao;

import com.liu.meetingmanagement.meetingroom.model.MeetingTime;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Vector;

/**
 * 会议时间dao层
 * @author 刘仁楠
 * @date 2018/5/21 14:59
 */
@Mapper
public interface MeetingTimeDao {

    /**
     * 获取所有开会时间记录
     * @author 刘仁楠
     * @date 2018/5/21 15:02
     */
    public List<MeetingTime> getAllMeetingTime();

    /**
     * 获得会议时间的总数
     * @author 刘仁楠
     * @date 2018/5/21 15:19
     */
    public Integer countMeetingTime();

    /**
     * 获得某一时间被使用的次数
     * @author 刘仁楠
     * @date 2018/5/21 15:30
     */
    public Integer countUsedTime(Integer timeID);

    /**
     * 获得某一时间内被使用的房间ID
     * @author 刘仁楠
     * @date 2018/5/21 16:25
     */
    public List<Integer> getUsedRoomID(Integer timeID);
}
