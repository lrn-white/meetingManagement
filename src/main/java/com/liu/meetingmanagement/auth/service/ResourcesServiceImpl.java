package com.liu.meetingmanagement.auth.service;

import com.liu.meetingmanagement.auth.dao.ResourceDao;
import com.liu.meetingmanagement.auth.model.SysResources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 刘仁楠
 * @date 2018/5/16 11:20
 */
@Service
public class ResourcesServiceImpl implements ResourcesService{

    @Autowired
    private ResourceDao resourceDao;

    /**
     * 获取所有资源信息
     * @author 刘仁楠
     * @date 2018/5/16 11:19
     */
    @Override
    public List<SysResources> getAllResources() {
        return resourceDao.getAllResources();
    }
}
