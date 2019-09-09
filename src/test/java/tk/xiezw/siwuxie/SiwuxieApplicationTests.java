package tk.xiezw.siwuxie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.xiezw.siwuxie.common.util.RedisCacheUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SiwuxieApplicationTests {

    @Autowired
    private RedisCacheUtil redisCacheUtil;

    @Test
    public void contextLoads() {
        redisCacheUtil.set("q", "ss12设定");
        System.out.println(redisCacheUtil.get("q"));
    }

}
