package tk.xiezw.siwuxie.common.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import tk.xiezw.siwuxie.common.util.HutoolLogUtil;
import tk.xiezw.siwuxie.common.util.R;

/**
 * @author xiezw
 * @date 2019/9/10
 */
@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(Exception.class)
    public R handleException(Exception e) {
        HutoolLogUtil.error(getClass(), e);
        return R.error(e.getMessage());
    }

    @ExceptionHandler(RestException.class)
    public R handleRestException(RestException e) {
        String msg = e.getMsg();
        HutoolLogUtil.warn(e.getClazz(), msg);
        return R.error(msg);
    }

}
