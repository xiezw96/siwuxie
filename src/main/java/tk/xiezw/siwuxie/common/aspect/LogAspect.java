package tk.xiezw.siwuxie.common.aspect;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author xiezw
 * @date 2019/9/10
 */
@Aspect
@Component
public class LogAspect {

    private static final Log log = LogFactory.get();

    @Pointcut("execution(* tk.xiezw.siwuxie.controller.*.*(..))")
    private void pointcut() {
    }

    @Before("pointcut()")
    private void before(JoinPoint point) {
        log.info("请求开始...");
    }

    @After("pointcut()")
    private void after(JoinPoint point) {
        log.info("请求结束...");
    }

}
