package com.liu.meetingmanagement.meetingroom.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 刘仁楠
 * @date 2018/5/22 13:47
 */
@Data
public class MeetingRecord implements Serializable{

    private static final long serialVersionUID = -7918793414462119283L;

    private Integer recordID;

    private String applicantName;

    private String participantName;

    private Integer roomID;

    private Integer timeID;

    private String openDate;

    private String meetingTopic;
}
