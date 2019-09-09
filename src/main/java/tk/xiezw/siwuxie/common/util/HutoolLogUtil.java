package tk.xiezw.siwuxie.common.util;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;

/**
 * @author xiezw
 * @date 2019/9/10
 */
public class HutoolLogUtil {

    private static Log log = LogFactory.get();

    public static void debug(Class<?> clazz, String msg) {
        log = LogFactory.get(clazz);
        log.debug(msg);
    }

    public static void info(Class<?> clazz, String msg) {
        log = LogFactory.get(clazz);
        log.info(msg);
    }

    public static void warn(Class<?> clazz, String msg) {
        log = LogFactory.get(clazz);
        log.warn(msg);
    }

    public static void error(Class<?> clazz, String msg) {
        log = LogFactory.get(clazz);
        log.error(msg);
    }

    public static void error(Class<?> clazz, String msg, Throwable t) {
        log = LogFactory.get(clazz);
        log.error(t, msg);
    }

}
