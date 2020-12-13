package entity;

import constant.enums.MsgEnum;

/**
 * 返回结果实体类
 *
 * @author: zhouwb
 * @date: 2020/11/29
 */
public class Result<T> {

    /**
     * 响应码
     */
    private String msgCode;

    /**
     * 响应信息
     */
    private String msgMessage;

    /**
     * 返回数据
     */
    private T data;

    public Result(MsgEnum msgEnum, T data) {
        this.msgCode = msgEnum.getCode();
        this.msgMessage = msgEnum.getMessage();
        this.data = data;
    }

    public Result(MsgEnum msgEnum) {
        this(msgEnum, null);
    }

    public Result() {
    }

    public static Result newInstance(MsgEnum msgEnum, Object data) {
        return new Result(msgEnum, data);
    }

    public static Result newInstance(MsgEnum msgEnum) {
        return new Result(msgEnum);
    }

    public String getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(String msgCode) {
        this.msgCode = msgCode;
    }

    public String getMsgMessage() {
        return msgMessage;
    }

    public void setMsgMessage(String msgMessage) {
        this.msgMessage = msgMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
