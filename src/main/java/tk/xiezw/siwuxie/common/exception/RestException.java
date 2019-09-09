package tk.xiezw.siwuxie.common.exception;

/**
 * @author xiezw
 * @date 2019/9/10
 */
public class RestException extends RuntimeException {

    private Class<?> clazz;

    private String msg;

    public RestException(Class<?> clazz, String msg) {
        this.clazz = clazz;
        this.msg = msg;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
