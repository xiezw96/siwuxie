package tk.xiezw.siwuxie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.xiezw.siwuxie.common.util.Result;
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
    public Result login() {
        loginService.test();
        return Result.ok("login");
    }

}
