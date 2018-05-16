package com.liu.meetingmanagement.auth.service;

import com.liu.meetingmanagement.auth.dao.ResourceDao;
import com.liu.meetingmanagement.auth.dao.UserDao;
import com.liu.meetingmanagement.auth.model.SysUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 刘仁楠
 * @date 2018/5/16 10:10
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Autowired
    private ResourceDao resourceDao;

    /**
     * 登录验证某个用户账号密码是否匹配
     * @author 刘仁楠
     * @date 2018/5/16 11:13
     */
    @Override
    public SysUser getUser(SysUser user) {
        SysUser info = userDao.getUser(user);
        return info;
    }

    /**
     * 根据userID获得资源路径
     * @author 刘仁楠
     * @date 2018/5/16 11:13
     */
    @Override
    public Set<String> getResourcesUrlByUserID(int userId) {
        Set<String> resourcesUrls = resourceDao.getResourcesUrlByUserID(userId);
        Set<String> result = new HashSet<>();
        for (String resourcesUrl : resourcesUrls){
            if (StringUtils.isBlank(resourcesUrl)) {
                continue;
            }
            resourcesUrl = StringUtils.trim(resourcesUrl);
            result.addAll(Arrays.asList(resourcesUrl.split("\\s*;\\s*")));
        }
        return result;
    }
}
