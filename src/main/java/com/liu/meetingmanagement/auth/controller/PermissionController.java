package com.liu.meetingmanagement.auth.controller;

import com.liu.meetingmanagement.auth.config.RequestUtils;
import com.liu.meetingmanagement.auth.model.SysUser;
import com.liu.meetingmanagement.auth.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * 权限验证控制
 * @author 刘仁楠
 * @date 2018/5/16 13:18
 */
@RestController
@RequestMapping(value = "/permission")
public class PermissionController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    @RequiresPermissions({"/usersPage"})
    public String login(){
        SysUser user = RequestUtils.currentLoginUser();
        Set<String> authorization = userService.getResourcesUrlByUserID(user.getUserID());
        return "该用户有如下权限" + authorization;
    }
}
