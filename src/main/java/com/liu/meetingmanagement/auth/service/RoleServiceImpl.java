package com.liu.meetingmanagement.auth.service;

import com.liu.meetingmanagement.auth.dao.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

/**
 * @author 刘仁楠
 * @date 2018/5/16 11:31
 */
@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleDao roleDao;

    @Override
    public Set<String> getRoleNameByUserId(Integer userID) {
        return roleDao.getRoleNameByUserId(userID);
    }
}
