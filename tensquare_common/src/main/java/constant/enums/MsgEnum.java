package constant.enums;

/**
 * 功能描述
 *
 * @author: zhouwb
 * @data: 2020/11/29
 */
public enum MsgEnum {

    /**
     * 操作成功
     */
    SUCESS("SYS00000","操作成功"),
    /**
     * 用户名或密码错误
     */
    LOGING_FAIL("SYS00001","用户名或密码错误"),
    /**
     * 权限不足
     */
    ACCESS_ERRO("SYS00002","权限不足"),
    /**
     * 远程调用失败
     */
    REMOTE_ERRO("SYS00003","远程调用失败"),
    /**
     * 系统错误
     */
    FAIL("SYS99999","操作失败"),
    ;

    /**
     * 消息码
     */
    private  String code;

    /**
     * 消息信息
     */
    private String message;


    private  MsgEnum() {
    }

    private MsgEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
