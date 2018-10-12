package yonyou.esn.openapi.common;

/**
 * 常量魔法值
 *
 * @author yangkun
 */
public class Constants {
    //服务号参数
    public static final String SEND_THROUGH_NOTIFY = "appNotify";
    public static final String SEND_THROUGH_ACCOUNT = "appAccount";
    public static final String SEND_SCOP_ALL = "all";
    public static final String SEND_SCOP_LIST = "list";
    public static final String USER_TYPY_MOBILE = "1";
    public static final String USER_TYPY_EMAIL = "2";

    //返回成功标识
    public static final String RETURN_SUCCESS_FLAG = "success";
    public static final Integer RETURN_ZERO_FLAG = 0;

    //微信端
    public static final String WX_PREALERT_FLAG="prealert";
    public static final String WX_ACCESS_TOEKN="wxAccessToken";
    public static final Long EXPIRE_2H=7200L;
    public static final String WX_PHONE_PREFIX=":tel";
    public static final String WX_Msg_TEXT_TYPE ="text";
    public static final String WX_Msg_EVENT_TYPE ="event";

}
