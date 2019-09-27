package tk.xiezw.siwuxie;

import cn.hutool.core.thread.ThreadUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tk.xiezw.siwuxie.common.util.Context;
import tk.xiezw.siwuxie.common.util.Log;

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
        Log.info(clazz, "思无邪项目已启动！");
        //ThreadUtil.excAsync(initThread);
    }

}

class initThread implements Runnable {
    public void run() {
        while (true) {
            System.out.println(System.currentTimeMillis());
            ThreadUtil.sleep(3000);
            System.out.println(System.currentTimeMillis());
            System.out.println("初始化成功！");
        }
    }
}
