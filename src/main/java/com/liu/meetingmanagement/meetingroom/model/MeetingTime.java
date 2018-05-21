package com.liu.meetingmanagement.meetingroom.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 会议时间实体类
 * @author 刘仁楠
 * @date 2018/5/21 14:58
 */
@Data
public class MeetingTime implements Serializable{

    private static final long serialVersionUID = -205568140486860046L;

    private Integer timeID;

    private String weekTime;

    private String dayTime;
}
