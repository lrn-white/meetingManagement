package com.liu.meetingmanagement.meetingroom.controller;

import com.liu.meetingmanagement.meetingroom.service.MeetingRoomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author 刘仁楠
 * @date 2018/5/15 11:22
 */
@RestController
@RequestMapping("/meetingroom")
public class MeetingRoomController {

    private static final Logger logger = LoggerFactory.getLogger(MeetingRoomController.class);

    @Autowired
    private MeetingRoomService meetingRoomService;

    /**
     * 获得所有会议室信息
     * @author 刘仁楠
     * @date 2018/5/15 11:38
     */
    @RequestMapping("/getAllMeetingRoom")
    public Map<String, Object> getAllMeetingRoom(int page, int limit){
        return meetingRoomService.getAllMeetingRoom(page,limit);
    }

    /**
     * 根据roomID删除会议室
     * @author 刘仁楠
     * @date 2018/5/17 16:58
     */
    @RequestMapping("/deleteMeetingRoomByRoomID")
    public Map<String,Object> deleteMeetingRoomByRoomID(Integer roomID){
        return meetingRoomService.deleteMeetingRoomByRoomID(roomID);
    }
}
