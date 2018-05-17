package com.liu.meetingmanagement.auth.controller;

import com.liu.meetingmanagement.auth.config.RequestUtils;
import com.liu.meetingmanagement.auth.model.SysUser;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 刘仁楠
 * @date 2018/5/16 13:13
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public String submitLogin(String username, String password, HttpServletRequest request) {
        try {
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);
            SysUser user = (SysUser) subject.getPrincipal();
        } catch (DisabledAccountException e) {
            return "/login.html";
        } catch (AuthenticationException e) {
            return "/login.html";
        }
        // 执行到这里说明用户已登录成功
        return "redirect:/index";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "/login.html";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String loginSuccessMessage(HttpServletRequest request) {
        String username = "未登录";
        SysUser currentLoginUser = RequestUtils.currentLoginUser();

        if (currentLoginUser != null && StringUtils.isNotEmpty(currentLoginUser.getUserName())) {
            username = currentLoginUser.getUserName();
        } else {
            return "redirect:/login";
        }
        request.setAttribute("username", username);
        return "/index.html";
    }

    //被踢出后跳转的页面
    @RequestMapping(value = "/kickout", method = RequestMethod.GET)
    public String kickOut() {
        return "/auth/kickout.html";
    }
}
