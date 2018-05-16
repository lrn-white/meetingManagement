package com.liu.meetingmanagement.auth.service;

import com.liu.meetingmanagement.auth.model.SysResources;

import java.util.List;

/**
 * @author 刘仁楠
 * @date 2018/5/16 11:19
 */
public interface ResourcesService {
    /**
     * 获取所有资源信息
     * @author 刘仁楠
     * @date 2018/5/16 11:19
     */
    List<SysResources> getAllResources();
}
