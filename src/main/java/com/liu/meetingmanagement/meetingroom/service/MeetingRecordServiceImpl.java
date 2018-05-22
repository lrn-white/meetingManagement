package com.liu.meetingmanagement.meetingroom.service;

import com.liu.meetingmanagement.commons.msg.MsgEnum;
import com.liu.meetingmanagement.commons.msg.MsgTemplate;
import com.liu.meetingmanagement.meetingroom.dao.MeetingRecordDao;
import com.liu.meetingmanagement.meetingroom.model.MeetingRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * @author 刘仁楠
 * @date 2018/5/22 14:01
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MeetingRecordServiceImpl implements MeetingRecordService {

    @Autowired
    private MeetingRecordDao meetingRecordDao;

    /**
     * 插入会议记录
     *
     * @author 刘仁楠
     * @date 2018/5/22 14:00
     */
    @Override
    public Map<String, Object> insertRecord(MeetingRecord meetingRecord) {
//        添加会议室和时间关联
        int flag1 = meetingRecordDao.insertRoomAndTime(meetingRecord);
        if (flag1 == 0){
            return MsgTemplate.failureMsg(MsgEnum.DATA_FAILURE);
        }
//        添加会议记录
        int flag2 = meetingRecordDao.insertRecord(meetingRecord);
        if (flag2 == 0){
            return MsgTemplate.failureMsg(MsgEnum.DATA_FAILURE);
        }
        return MsgTemplate.successMsg();
    }
}
