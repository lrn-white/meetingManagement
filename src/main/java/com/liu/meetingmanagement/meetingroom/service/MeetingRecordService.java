package com.liu.meetingmanagement.meetingroom.service;

import com.liu.meetingmanagement.meetingroom.model.MeetingRecord;

import java.util.Map;

/**
 * @author 刘仁楠
 * @date 2018/5/22 14:01
 */
public interface MeetingRecordService {

    /**
     * 插入会议记录
     * @author 刘仁楠
     * @date 2018/5/22 14:00
     */
    public Map<String, Object> insertRecord(MeetingRecord meetingRecord);
}
