package com.liu.meetingmanagement.commons.msg;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 封装http请求返回的json数据
 * @author 刘仁楠
 * @date 2018/5/15 11:16
 */
public class MsgTemplate {

    private static final Logger logger = LoggerFactory.getLogger(MsgTemplate.class);

    /**
     * 成功输出
     * @return
     */
    public static Map<String, Object> successMsg() {
        return successMsg(null,0);
    }

    /**
     * 成功输出
     * @param data 输出数据
     * @return
     */
    public static Map<String, Object> successMsg(Object data,int count) {
        return customMsg(0,"", count,data);
    }

    /**
     * 成功输出
     * @param data 输出数据
     * @return
     */
    public static Map<String, Object> successMsg(Object data) {
        return customMsg(0,"", data);
    }

    /**
     * 错误输出
     * @param message MsgInterface接口类型
     * @return
     */
    public static Map<String, Object> failureMsg(MsgInterface message) {
        return customMsg( message.getCode(), message.getMsg(),0, null);
    }

    /**
     * 输出模板
     * @author 刘仁楠
     * @date 2018/5/18 10:13
     */
    private static Map<String, Object> customMsg(int msgCode, String message, int count,Object data) {
//        LinkedHashMap存入的值不会自动排序
        Map<String, Object> result = new LinkedHashMap<String, Object>();
        result.put("code", msgCode);
        result.put("msg", message);
        result.put("count",count);
        result.put("data", data);
        try {
            ObjectMapper mapper = new ObjectMapper();
            logger.info("返回输出：", mapper.writeValueAsString(result));
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 输出模板
     * @author 刘仁楠
     * @date 2018/5/18 10:13
     */
    private static Map<String, Object> customMsg(int msgCode, String message,Object data) {
        Map<String, Object> result = new LinkedHashMap<String, Object>();
        result.put("code", msgCode);
        result.put("msg", message);
        result.put("data", data);
        try {
            ObjectMapper mapper = new ObjectMapper();
            logger.info("返回输出：", mapper.writeValueAsString(result));
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
