package yonyou.esn.openapi.common;

public class Response {
    boolean flag ;
    String errorMsg;
    Object data;

    public Response(){
        this.flag = true;
    }
    public Response(boolean flag, Object data){
        this.flag = true;
        this.data = data;
    }

    public Response wrap(Object data){
        this.data = data;
        return this;
    }


    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
