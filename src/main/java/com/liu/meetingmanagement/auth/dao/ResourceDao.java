package com.liu.meetingmanagement.auth.dao;

import com.liu.meetingmanagement.auth.model.SysResources;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author 刘仁楠
 * @date 2018/5/16 10:34
 */
@Mapper
public interface ResourceDao {

    /**
     * 获取所有资源信息
     * @author 刘仁楠
     * @date 2018/5/16 11:07
     */
    public List<SysResources> getAllResources();

    /**
     * 根据用户id获取资源路径
     * @author 刘仁楠
     * @date 2018/5/16 11:08
     */
    public Set<String> getResourcesUrlByUserID(Integer userID);
}
