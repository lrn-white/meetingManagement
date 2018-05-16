package com.liu.meetingmanagement.auth.config;

import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthorizedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 拦截未授权的访问
 *
 * @author 刘仁楠
 * @date 2018/5/16 10:04
 */
@ControllerAdvice
public class CtrlExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(CtrlExceptionHandler.class);

    /**
     * 拦截未授权页面
     *
     * @author 刘仁楠
     * @date 2018/5/16 10:06
     */
    @ResponseStatus(value = HttpStatus.FORBIDDEN)
    @ExceptionHandler(UnauthorizedException.class)
    public String handleException(UnauthorizedException e) {
        logger.debug(e.getMessage());
        return "/auth/403.html";
    }

    @ResponseStatus(value = HttpStatus.FORBIDDEN)
    @ExceptionHandler(AuthorizationException.class)
    public String handleException2(AuthorizationException e) {
        logger.debug(e.getMessage());
        return "/auth/403.html";
    }
}
