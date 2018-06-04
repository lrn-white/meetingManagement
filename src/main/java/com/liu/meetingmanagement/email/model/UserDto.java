package com.liu.meetingmanagement.email.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 刘仁楠
 * @date 2018/5/29 16:24
 */
@Data
public class UserDto implements Serializable {

    private static final long serialVersionUID = 5300683776539548150L;

    private String userName;

    private String email;
}
