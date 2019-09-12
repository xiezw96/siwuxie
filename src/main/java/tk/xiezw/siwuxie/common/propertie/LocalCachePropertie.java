package tk.xiezw.siwuxie.common.propertie;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author xiezw
 * @date 2019/9/10
 */
@Data
@ConfigurationProperties("siwuxie.localcache")
@Component
public class LocalCachePropertie {

    private int capacity;

}
