package com.liu.meetingmanagement.commons.msg;

/**
 * @author 刘仁楠
 * @date 2018/5/15 11:19
 */
public enum MsgEnum implements MsgInterface {

    /**
     * 返回枚举code
     */
    OPS_SUCCESS(0, "操作成功"),

    OPS_FAILURE(1, "操作失败"),

    SYS_EXCEPTION(2, "系统异常,已通知系统管理员，请重新登录后再试"),

    NOT_LOGIN(3, "抱歉，您还未登录，或token已过期，请登录后再试"),

    OPS_ILLEGAL(4, "非法操作，系统已记录您的ip，并已通知系统管理员"),

    NOT_AUTH(5, "抱歉，您暂无权限访问，请联系相关人员"),

    UNKNOW(6, "未知错误"),

    PARAMS_ERROR(-1, "参数错误"),

    DATA_FAILURE(7, "数据库操作失败"),

    OPS_EMPTY(8, "返回数据为空"),

    PARAMS_EMPTY(9,"参数为空");


    private String msg;

    private int code;

    MsgEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
