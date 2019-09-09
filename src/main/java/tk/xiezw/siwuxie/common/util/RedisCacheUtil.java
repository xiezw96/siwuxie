package tk.xiezw.siwuxie.common.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author xiezw
 * @date 2019/9/10
 */
@Component
public class RedisCacheUtil {

    @Autowired
    private StringRedisTemplate stringRedisTemplate0;

    @Autowired
    private StringRedisTemplate stringRedisTemplate1;

    public void set(String key, String value) {
        stringRedisTemplate1.opsForValue().set(key, value);
    }

    public void set(String key, String value, long expire) {
        stringRedisTemplate1.opsForValue().set(key, value);
        stringRedisTemplate1.expire(key, expire, TimeUnit.SECONDS);
    }

    public String get(String key) {
        return stringRedisTemplate1.opsForValue().get(key);
    }

}
