package tk.xiezw.siwuxie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.xiezw.siwuxie.dao.SysUserDao;
import tk.xiezw.siwuxie.entity.SysUser;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SiwuxieApplicationTests {

    @Autowired
    private SysUserDao sysUserDao;

    @Test
    public void contextLoads() {
        System.out.println(sysUserDao.findById(1L).get());
    }

}
