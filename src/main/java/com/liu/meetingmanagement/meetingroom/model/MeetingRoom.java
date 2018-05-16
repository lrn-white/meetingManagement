package com.liu.meetingmanagement.meetingroom.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 刘仁楠
 * @date 2018/5/15 11:27
 */
@Data
public class MeetingRoom implements Serializable {
    private static final long serialVersionUID = -251442595289119120L;

    /**
     * 会议室ID
     */
    private Integer roomID;
    /**
     * 会议室名
     */
    private String roomName;
    /**
     * 会议室最大容纳人数
     */
    private Integer roomCapacity;
    /**
     * 会议室位置
     */
    private String roomLocation;
}
