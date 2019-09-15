package tk.xiezw.siwuxie.common.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import tk.xiezw.siwuxie.common.util.Log;

/**
 * @author xiezw
 * @date 2019/9/10
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(* tk.xiezw.siwuxie.controller.*.*(..))")
    private void pointcut() {
    }

    @Before("pointcut()")
    private void before(JoinPoint point) {
        Log.info(point.getTarget().getClass(), "请求开始...");
    }

    @After("pointcut()")
    private void after(JoinPoint point) {
        Log.info(point.getTarget().getClass(), "请求结束...");
    }

}
