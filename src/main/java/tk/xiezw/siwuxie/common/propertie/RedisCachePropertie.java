package tk.xiezw.siwuxie.common.propertie;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author xiezw
 * @date 2019/9/10
 */
@Component
@ConfigurationProperties("siwuxie.rediscache")
@Data
public class RedisCachePropertie {

    private String host;

    private int port;

    private int databese;

    private String password;

}
