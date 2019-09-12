package tk.xiezw.siwuxie.common.util;

import cn.hutool.cache.Cache;
import cn.hutool.db.nosql.redis.RedisDS;
import cn.hutool.setting.Setting;
import org.springframework.context.ApplicationContext;
import redis.clients.jedis.Jedis;
import tk.xiezw.siwuxie.common.propertie.LocalCachePropertie;
import tk.xiezw.siwuxie.common.propertie.RedisCachePropertie;

/**
 * @author xiezw
 * @date 2019/9/10
 */
public class HutoolCache {

    private static Cache<String, String> fifoCache;

    private static Jedis jedis;

    static {
        LocalCachePropertie localCachePropertie = Context.getBean(LocalCachePropertie.class);
        RedisCachePropertie redisCachePropertie = Context.getBean(RedisCachePropertie.class);
        if (localCachePropertie != null && redisCachePropertie != null) {
            Setting setting = new Setting();
            setting.set("host", redisCachePropertie.getHost());
            setting.set("port", String.valueOf(redisCachePropertie.getPort()));
            setting.set("database", String.valueOf(redisCachePropertie.getDatabese()));
            setting.set("password", redisCachePropertie.getPassword());
            fifoCache = cn.hutool.cache.CacheUtil.newFIFOCache(localCachePropertie.getCapacity());
            jedis = RedisDS.create(setting, null).getJedis();
        } else {
            fifoCache = cn.hutool.cache.CacheUtil.newFIFOCache(3000);
            jedis = RedisDS.create(new Setting("file/setting/redis.setting"), null).getJedis();
        }
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

    private static ApplicationContext applicationContext;

}
