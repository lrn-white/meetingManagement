package com.liu.meetingmanagement.meetingroom.controller;

import com.liu.meetingmanagement.commons.msg.MsgEnum;
import com.liu.meetingmanagement.commons.msg.MsgTemplate;
import com.liu.meetingmanagement.meetingroom.model.MeetingRecord;
import com.liu.meetingmanagement.meetingroom.service.MeetingRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author 刘仁楠
 * @date 2018/5/22 14:10
 */
@RestController
@RequestMapping("/meetingRecord")
public class MeetingRecordController {

    private static final Logger logger = LoggerFactory.getLogger(MeetingRecordController.class);

    @Autowired
    private MeetingRecordService meetingRecordService;

    /**
     * 插入会议记录
     * @author 刘仁楠
     * @date 2018/5/22 14:00
     */
    @RequestMapping("/insertRecord")
    public Map<String, Object> insertRecord(MeetingRecord meetingRecord) {
        try {
            if (ObjectUtils.isEmpty(meetingRecord)){
                return MsgTemplate.failureMsg(MsgEnum.PARAMS_EMPTY);
            }else {
                return meetingRecordService.insertRecord(meetingRecord);
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            return MsgTemplate.failureMsg(MsgEnum.OPS_FAILURE);
        }
    }
}
