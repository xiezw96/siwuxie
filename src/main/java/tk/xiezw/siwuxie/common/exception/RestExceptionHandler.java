package tk.xiezw.siwuxie.common.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import tk.xiezw.siwuxie.common.util.HutoolLog;
import tk.xiezw.siwuxie.common.util.R;

/**
 * @author xiezw
 * @date 2019/9/10
 */
@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(Exception.class)
    public R handleException(Exception e) {
        HutoolLog.error(getClass(), "系统异常", e);
        return R.error(e.getMessage());
    }

    @ExceptionHandler(RestException.class)
    public R handleRestException(RestException e) {
        HutoolLog.error(getClass(), "业务异常", e);
        return R.error(e.getMessage());
    }

}
