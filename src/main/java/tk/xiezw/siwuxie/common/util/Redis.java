package tk.xiezw.siwuxie.common.util;

import cn.hutool.core.date.DateUnit;
import cn.hutool.db.nosql.redis.RedisDS;
import redis.clients.jedis.Jedis;

/**
 * @author xiezw
 * @date 2019/9/10
 */
public class Redis {

    private static Jedis jedis = RedisDS.create().getJedis();

    public static void set(String key, String value) {
        jedis.set(key, value);
    }

    public static void set(String key, String value, long millis) {
        jedis.set(key, value);
        jedis.pexpire(key, millis);
    }

    public static void put(String key, String value) {
        jedis.set(key, value);
        long millis = jedis.ttl(key) * DateUnit.SECOND.getMillis();
        if (millis > 0) {
            jedis.pexpire(key, millis);
        }
    }

    public static String get(String key) {
        return jedis.get(key);
    }

}
