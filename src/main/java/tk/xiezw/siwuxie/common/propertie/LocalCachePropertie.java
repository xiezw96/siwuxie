package tk.xiezw.siwuxie.common.propertie;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author xiezw
 * @date 2019/9/10
 */

@Component
@ConfigurationProperties("siwuxie.localcache")
@Data
public class LocalCachePropertie {

    private int capacity;

}
