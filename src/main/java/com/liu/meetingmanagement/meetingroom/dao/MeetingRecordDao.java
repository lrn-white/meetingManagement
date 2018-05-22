package com.liu.meetingmanagement.meetingroom.dao;

import com.liu.meetingmanagement.meetingroom.model.MeetingRecord;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 刘仁楠
 * @date 2018/5/22 13:52
 */
@Mapper
public interface MeetingRecordDao {

    /**
     * 插入会议记录
     * @author 刘仁楠
     * @date 2018/5/22 14:00
     */
    public int insertRecord(MeetingRecord meetingRecord);

    /**
     * 插入时间和会议室关联
     * @author 刘仁楠
     * @date 2018/5/22 14:38
     */
    public int insertRoomAndTime(MeetingRecord meetingRecord);
}
