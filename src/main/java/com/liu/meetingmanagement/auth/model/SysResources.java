package com.liu.meetingmanagement.auth.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 资源实体类
 * @author 刘仁楠
 * @date 2018/5/16 9:37
 */
@Data
public class SysResources implements Serializable {

    private static final long serialVersionUID = -3734441107029315769L;

    /**
     * 资源ID
     */
    private Integer resourceID;
    /**
     * 资源名
     */
    private String resourceName;
    /**
     * 资源路径
     */
    private String resourceUrl;
}
