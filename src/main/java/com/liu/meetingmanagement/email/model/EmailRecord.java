package com.liu.meetingmanagement.email.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 刘仁楠
 * @date 2018/6/4 16:15
 */
@Data
public class EmailRecord implements Serializable{

    private static final long serialVersionUID = 5369859236238531953L;

    private Integer recordID;

    private String email;

    private String senderName;

    private String receiverName;

    private String content;
}
