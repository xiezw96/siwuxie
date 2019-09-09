package tk.xiezw.siwuxie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.xiezw.siwuxie.common.exception.RestException;
import tk.xiezw.siwuxie.dao.SysUserDao;
import tk.xiezw.siwuxie.entity.SysUser;

import java.util.Date;

/**
 * @author xiezw
 * @date 2019/9/10
 */
@RestController
public class LoginController {

    @Autowired
    private SysUserDao sysUserDao;

    @GetMapping("/login")
    public SysUser login() {
        System.out.println(new Date());
        if (true) {
            throw new RestException(getClass(), "测试自定义异常类");
        }
        return sysUserDao.findById(1L).get();
    }

}
