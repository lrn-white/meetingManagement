package com.liu.meetingmanagement.commons.msg;

/**
 * @author 刘仁楠
 * @date 2018/5/15 11:19
 */
public enum MsgEnum implements MsgInterface {

    /**
     * 返回枚举code
     */
    OPS_SUCCESS(100000, "操作成功"),

    OPS_FAILURE(100001, "操作失败"),

    SYS_EXCEPTION(100002, "系统异常,已通知系统管理员，请重新登录后再试"),

    NOT_LOGIN(100003, "抱歉，您还未登录，或token已过期，请登录后再试"),

    OPS_ILLEGAL(100004, "非法操作，系统已记录您的ip，并已通知系统管理员"),

    NOT_AUTH(100005, "抱歉，您暂无权限访问，请联系相关人员"),

    UNKNOW(100006, "未知错误"),

    PARAMS_ERROR(-100000, "参数错误"),

    PERMISSION_NULL(100007, "没有权限，请到主账号修改"),

    OPS_EMPTY(100008, "返回数据为空");

    private int code;

    private String msg;

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
