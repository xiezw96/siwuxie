package tk.xiezw.siwuxie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.xiezw.siwuxie.common.util.R;
import tk.xiezw.siwuxie.common.util.Weather;

/**
 * @author xiezw
 * @date 2019/9/10
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public R login() {
        return R.ok(Weather.getLiveInfo("南安"));
    }

    public static void main(String[] args) {
    }

}
