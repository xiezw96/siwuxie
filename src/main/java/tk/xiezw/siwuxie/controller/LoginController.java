package tk.xiezw.siwuxie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.xiezw.siwuxie.common.util.HutoolCache;
import tk.xiezw.siwuxie.common.util.R;
import tk.xiezw.siwuxie.service.LoginService;

/**
 * @author xiezw
 * @date 2019/9/10
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public R login() {
        HutoolCache.redisSet("sssss", "sssss");
        return R.ok("login");
    }

}
