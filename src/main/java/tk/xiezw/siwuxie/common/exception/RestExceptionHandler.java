package tk.xiezw.siwuxie.common.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import tk.xiezw.siwuxie.common.util.HutoolLogUtil;
import tk.xiezw.siwuxie.common.util.Result;

/**
 * @author xiezw
 * @date 2019/9/10
 */
@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e) {
        HutoolLogUtil.error(getClass(), "系统异常", e);
        return Result.error(e.getMessage());
    }

    @ExceptionHandler(RestException.class)
    public Result handleRestException(RestException e) {
        HutoolLogUtil.error(getClass(), "业务异常", e);
        return Result.error(e.getMessage());
    }

}
