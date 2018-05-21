package com.liu.meetingmanagement.meetingroom.service;

import com.liu.meetingmanagement.commons.msg.MsgEnum;
import com.liu.meetingmanagement.commons.msg.MsgTemplate;
import com.liu.meetingmanagement.meetingroom.dao.MeetingRoomDao;
import com.liu.meetingmanagement.meetingroom.dao.MeetingTimeDao;
import com.liu.meetingmanagement.meetingroom.model.MeetingRoom;
import com.liu.meetingmanagement.meetingroom.model.MeetingTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/**
 * @author 刘仁楠
 * @date 2018/5/21 15:03
 */
@Transactional(rollbackFor = Exception.class)
@Service
public class MeetingTimeServiceImpl implements MeetingTimeService {

    @Autowired
    private MeetingTimeDao meetingTimeDao;

    @Autowired
    private MeetingRoomDao meetingRoomDao;

    /**
     * 获取所有开会时间记录
     *
     * @author 刘仁楠
     * @date 2018/5/21 15:02
     */
    @Override
    public Map<String, Object> getAllMeetingTime() {
        List<MeetingTime> meetingTimes = meetingTimeDao.getAllMeetingTime();
        if (ObjectUtils.isEmpty(meetingTimes)) {
            return MsgTemplate.failureMsg(MsgEnum.OPS_EMPTY);
        }
        return MsgTemplate.successMsg(meetingTimes);
    }

    /**
     * 获得空闲的会议时间
     *
     * @author 刘仁楠
     * @date 2018/5/21 15:18
     */
    @Override
    public Map<String, Object> getFreeTime() {
        Integer countRoom = meetingRoomDao.countMeetingRoom();

        List<MeetingTime> meetingTimes = meetingTimeDao.getAllMeetingTime();

//        判断某一时间已使用的次数是否已经满了
        List<MeetingTime> meetingTimeList = new ArrayList<>();
        for (MeetingTime meetingTime : meetingTimes) {
            Integer timeID = meetingTime.getTimeID();
            Integer countUsedTime = meetingTimeDao.countUsedTime(timeID);
            if (countUsedTime < countRoom) {
                meetingTimeList.add(meetingTime);
            }
        }

//        对返回数据判空
        if (ObjectUtils.isEmpty(meetingTimeList)) {
            return MsgTemplate.failureMsg(MsgEnum.OPS_EMPTY);
        } else {
            return MsgTemplate.successMsg(meetingTimeList);
        }
    }

    /**
     * 获得某一时间内的所有空闲会议室
     *
     * @author 刘仁楠
     * @date 2018/5/21 16:15
     */
    @Override
    public Map<String, Object> getFreeRoom(Integer timeID) {
        int flag = 0;

        List<MeetingRoom> meetingRoomList = new ArrayList<>();

        List<MeetingRoom> meetingRooms = meetingRoomDao.getAllMeetingRoom();

        List<Integer> roomIDs = meetingTimeDao.getUsedRoomID(timeID);
//        去掉已使用的房间
        for (MeetingRoom meetingRoom : meetingRooms) {
            for (Integer roomID : roomIDs) {
                if (roomID.equals(meetingRoom.getRoomID())) {
                    flag ++;
                }
            }
            if (flag == 0){
                meetingRoomList.add(meetingRoom);
            }
            flag = 0;
        }

        if (ObjectUtils.isEmpty(meetingRoomList)) {
            return MsgTemplate.failureMsg(MsgEnum.OPS_EMPTY);
        } else {
            return MsgTemplate.successMsg(meetingRoomList);
        }
    }
}
