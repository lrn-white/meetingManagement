package com.liu.meetingmanagement.meetingroom.controller;

import com.liu.meetingmanagement.commons.msg.MsgEnum;
import com.liu.meetingmanagement.commons.msg.MsgTemplate;
import com.liu.meetingmanagement.meetingroom.model.MeetingRoom;
import com.liu.meetingmanagement.meetingroom.service.MeetingTimeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author 刘仁楠
 * @date 2018/5/21 15:35
 */
@RestController
@RequestMapping("/meetingtime")
public class MeetingTimeController {

    private static final Logger logger = LoggerFactory.getLogger(MeetingTimeController.class);

    @Autowired
    private MeetingTimeService meetingTimeService;


    /**
     * 获得空闲的会议时间
     * @author 刘仁楠
     * @date 2018/5/21 15:18
     */
    @PostMapping("/getFreeTime")
    public Map<String, Object> getFreeTime() {
        return meetingTimeService.getFreeTime();
    }

    /**
     * 获得某一时间内的所有空闲会议室
     *
     * @author 刘仁楠
     * @date 2018/5/21 16:15
     */
    @PostMapping("/getFreeRoom")
        public Map<String, Object> getFreeRoom(Integer timeID) {
        try {
            if (ObjectUtils.isEmpty(timeID)){
                return MsgTemplate.failureMsg(MsgEnum.PARAMS_EMPTY);
            } else {
                return meetingTimeService.getFreeRoom(timeID);
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            return MsgTemplate.failureMsg(MsgEnum.OPS_FAILURE);
        }
    }
}
