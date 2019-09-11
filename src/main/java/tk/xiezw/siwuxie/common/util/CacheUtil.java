package tk.xiezw.siwuxie.common.util;

import cn.hutool.cache.Cache;
import cn.hutool.db.nosql.redis.RedisDS;
import redis.clients.jedis.Jedis;

/**
 * @author xiezw
 * @date 2019/9/10
 */
public class CacheUtil {

    private static Cache<String, String> fifoCache = cn.hutool.cache.CacheUtil.newFIFOCache(3000);

    private static Jedis jedis = RedisDS.create().getJedis();

    static {
    }

    public static void localSet(String key, String value) {
        fifoCache.put(key, value);
    }

    public static String localGet(String key) {
        return fifoCache.get(key);
    }

    public static void redisSet(String key, String value) {
        jedis.set(key, value);
    }

    public static String redisSetGet(String key) {
        return jedis.get(key);
    }

    public static void main(String[] args) {
        redisSet("s", "s");
        System.out.println(redisSetGet("s"));
    }

}
