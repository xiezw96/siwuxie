package tk.xiezw.siwuxie.controller;

import cn.hutool.core.lang.Dict;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.xiezw.siwuxie.common.util.R;

/**
 * @author xiezw
 * @date 2019/9/10
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public R login() {
        int i = 8/0;
        return R.ok();
    }

    public static void main(String[] args) {
    }

}
