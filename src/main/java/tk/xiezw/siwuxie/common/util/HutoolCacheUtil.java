package tk.xiezw.siwuxie.common.util;

import cn.hutool.cache.Cache;
import cn.hutool.cache.CacheUtil;

/**
 * @author xiezw
 * @date 2019/9/10
 */
public class HutoolCacheUtil {

    private static Cache<String, String> fifoCache = CacheUtil.newFIFOCache(3000);

    public static void setKey(String key, String value) {
        fifoCache.put(key, value);
    }

    public static String getKey(String key) {
        return fifoCache.get(key);
    }

}
