package tk.xiezw.siwuxie.common.exception;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import tk.xiezw.siwuxie.common.util.R;

/**
 * @author xiezw
 * @date 2019/9/10
 */
@RestControllerAdvice
public class RestExceptionHandler {

    private static final Log log = LogFactory.get();

    @ExceptionHandler(Exception.class)
    public R handleException(Exception e) {
        log.error(e, "系统异常");
        return R.error(e.getMessage());
    }

    @ExceptionHandler(RestException.class)
    public R handleRestException(RestException e) {
        log.error(e, "业务异常");
        return R.error(e.getMessage());
    }

}
