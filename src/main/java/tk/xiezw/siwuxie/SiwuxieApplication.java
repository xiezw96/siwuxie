package tk.xiezw.siwuxie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tk.xiezw.siwuxie.common.util.Context;
import tk.xiezw.siwuxie.common.util.HutoolLog;

/**
 * @author xiezw
 * @date 2019/9/10
 */
@SpringBootApplication
public class SiwuxieApplication {

    public static void main(String[] args) {
        Class<SiwuxieApplication> clazz = SiwuxieApplication.class;
        ConfigurableApplicationContext context = SpringApplication.run(clazz, args);
        Context.setApplicationContext(context);
        HutoolLog.info(clazz, "思无邪已启动！");
    }

}
