package com.liu.meetingmanagement.email.service;

import com.liu.meetingmanagement.commons.msg.MsgEnum;
import com.liu.meetingmanagement.commons.msg.MsgTemplate;
import com.liu.meetingmanagement.email.dao.UserDtoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 刘仁楠
 * @date 2018/5/31 10:28
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EmailServiceimpl implements EmailService {

    @Autowired
    private UserDtoDao userDao;

    @Autowired
    JavaMailSender jms;

    /**
     * 群发通知会议邮件
     *
     * @author 刘仁楠
     * @date 2018/5/31 10:27
     */
    @Override
    public Integer sendGroupEmail(String userNames) {

        //建立邮件消息
        SimpleMailMessage mainMessage = new SimpleMailMessage();
        //发送者
        mainMessage.setFrom("liurennan1996@163.com");
        //发送的标题
        mainMessage.setSubject("嗨喽");
        //发送的内容
        mainMessage.setText("hello world");

//        对获取到的username进行处理
//        将中文逗号替换成英文逗号
        String userNames2 = userNames.replaceAll("，", ",");
//        分割后存入数组
        String[] strArr = userNames2.split(",");

//        判断数据库中邮箱信息是否都存在,如果都存在则发送消息
        List<String> emails = new ArrayList<>();
        for (String userName : strArr) {
            String email = userDao.getEmailByUserName(userName);
            if (!ObjectUtils.isEmpty(email)) {
                emails.add(email);
            }
        }
        if (emails.size() != strArr.length) {
            return 0;
        } else {
            for (String email : emails) {
                mainMessage.setTo(email);
                jms.send(mainMessage);
            }
        }
        return 1;
    }
}
