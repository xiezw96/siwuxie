package tk.xiezw.siwuxie;

import cn.hutool.log.StaticLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiezw
 * @date 2019/9/10
 */
@SpringBootApplication
public class SiwuxieApplication {

    public static void main(String[] args) {
        SpringApplication.run(SiwuxieApplication.class, args);
        StaticLog.info("思无邪项目已启动！");
    }

}
