package tk.xiezw.siwuxie.common.util;

import org.springframework.context.ApplicationContext;

/**
 * @author xiezw
 * @date 2019/9/10
 */
public class Context {

    private static ApplicationContext applicationContext;

    public static void setApplicationContext(ApplicationContext context) {
        applicationContext = context;
    }

    public static <T> T getBean(Class<T> clazz) {
        if (applicationContext == null) {
            return null;
        }
        return applicationContext.getBean(clazz);
    }

}
