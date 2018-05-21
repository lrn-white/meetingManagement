package com.liu.meetingmanagement.meetingroom.controller;

import com.liu.meetingmanagement.commons.msg.MsgEnum;
import com.liu.meetingmanagement.commons.msg.MsgTemplate;
import com.liu.meetingmanagement.meetingroom.model.MeetingRoom;
import com.liu.meetingmanagement.meetingroom.service.MeetingRoomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 会议室管理控制层
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
     *
     * @author 刘仁楠
     * @date 2018/5/15 11:38
     */
    @RequestMapping("/getAllMeetingRoom")
    public Map<String, Object> getAllMeetingRoom(int page, int limit) {
        try {
            return meetingRoomService.getAllMeetingRoom(page, limit);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            return MsgTemplate.failureMsg(MsgEnum.OPS_FAILURE);
        }
    }

    /**
     * 根据roomID删除会议室
     *
     * @author 刘仁楠
     * @date 2018/5/17 16:58
     */
    @PostMapping("/deleteMeetingRoomByRoomID")
    public Map<String, Object> deleteMeetingRoomByRoomID(Integer roomID) {
        try {
            if (roomID == null) {
                return MsgTemplate.failureMsg(MsgEnum.PARAMS_EMPTY);
            } else {
                return meetingRoomService.deleteMeetingRoomByRoomID(roomID);
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            return MsgTemplate.failureMsg(MsgEnum.OPS_FAILURE);
        }
    }

    /**
     * 根据roomID获取会议室详情
     *
     * @author 刘仁楠
     * @date 2018/5/18 10:05
     */
    @PostMapping("/getMeetingRoomByRoomID")
    public Map<String, Object> getMeetingRoomByRoomID(Integer roomID) {
        try {
            if (roomID == null) {
                return MsgTemplate.failureMsg(MsgEnum.PARAMS_EMPTY);
            } else {
                return meetingRoomService.getMeetingRoomByRoomID(roomID);
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            return MsgTemplate.failureMsg(MsgEnum.OPS_FAILURE);
        }
    }

    /**
     * 根据roomID修改会议室详情
     * @author 刘仁楠
     * @date 2018/5/18 15:17
     */
    @PostMapping("/updateMeetingRoomByRoomID")
    public Map<String,Object> updateMeetingRoomByRoomID(MeetingRoom meetingRoom){
        try {
            if (meetingRoom.getRoomID() == null){
                return MsgTemplate.failureMsg(MsgEnum.PARAMS_EMPTY);
            } else {
                return meetingRoomService.updateMeetingRoomByRoomID(meetingRoom);
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            return MsgTemplate.failureMsg(MsgEnum.OPS_FAILURE);
        }
    }

    /**
     * 新增会议室
     * @author 刘仁楠
     * @date 2018/5/18 16:21
     */
    @PostMapping("/newMeetingRoom")
    public Map<String,Object> newMeetingRoom(MeetingRoom meetingRoom){
        try {
            if (ObjectUtils.isEmpty(meetingRoom)){
                return MsgTemplate.failureMsg(MsgEnum.PARAMS_EMPTY);
            }else {
                return meetingRoomService.newMeetingRoom(meetingRoom);
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            return MsgTemplate.failureMsg(MsgEnum.OPS_FAILURE);
        }
    }

    /**
     * 根据会议室名查询会议室
     *
     * @author 刘仁楠
     * @date 2018/5/21 10:39
     */
    @PostMapping("/getMeetingRoomByRoomName")
    public Map<String, Object> getMeetingRoomByRoomName(String roomName) {
        try {
            if (roomName.isEmpty()){
                return MsgTemplate.failureMsg(MsgEnum.PARAMS_EMPTY);
            }else {
                return meetingRoomService.getMeetingRoomByRoomName(roomName);
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            return MsgTemplate.failureMsg(MsgEnum.OPS_FAILURE);
        }
    }
}
