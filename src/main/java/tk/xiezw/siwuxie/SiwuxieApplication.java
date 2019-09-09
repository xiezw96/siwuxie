package tk.xiezw.siwuxie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.xiezw.siwuxie.common.util.HutoolLogUtil;

/**
 * @author xiezw
 * @date 2019/9/10
 */
@SpringBootApplication
public class SiwuxieApplication {

    public static void main(String[] args) {
        Class<SiwuxieApplication> clazz = SiwuxieApplication.class;
        SpringApplication.run(clazz, args);
        HutoolLogUtil.info(clazz, "思无邪已启动！");
    }

}
