package tk.xiezw.siwuxie.service.impl;

import org.springframework.stereotype.Service;
import tk.xiezw.siwuxie.common.exception.RestException;
import tk.xiezw.siwuxie.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public void test() {
        try {
            int i = 8 / 0;
        } catch (Exception e) {
            throw new RestException("擦粉");
        }
        System.out.println("**************************************************");
    }

}
