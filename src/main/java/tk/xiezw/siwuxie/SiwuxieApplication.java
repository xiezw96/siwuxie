package tk.xiezw.siwuxie;

import cn.hutool.log.StaticLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tk.xiezw.siwuxie.common.util.Context;

/**
 * @author xiezw
 * @date 2019/9/10
 */
@SpringBootApplication
public class SiwuxieApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SiwuxieApplication.class, args);
        Context.init(context);
        StaticLog.info("思无邪项目已启动！");
    }

}
