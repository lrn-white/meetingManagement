package com.liu.meetingmanagement.email.dao;

import com.liu.meetingmanagement.email.model.EmailRecord;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 刘仁楠
 * @date 2018/6/4 16:21
 */
@Mapper
public interface EmailRecordDao {

    /**
     * 插入邮件发送记录
     * @author 刘仁楠
     * @date 2018/6/4 16:29
     */
    public Integer addEmailReocrd(EmailRecord emailRecord);
}
