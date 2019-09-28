package tk.xiezw.siwuxie.common.util;

import cn.hutool.cache.CacheUtil;
import cn.hutool.cache.file.LFUFileCache;
import cn.hutool.cache.file.LRUFileCache;
import cn.hutool.cache.impl.*;
import cn.hutool.core.date.DateUnit;

/**
 * @author xiezw
 * @date 2019/9/10
 */
public class Cache {

    private static FIFOCache fifo = CacheUtil.newFIFOCache(1000);

    private static LFUCache lfu = CacheUtil.newLFUCache(1000);

    private static LRUCache lru = CacheUtil.newLRUCache(1000);

    private static TimedCache timed = CacheUtil.newTimedCache(DateUnit.DAY.getMillis());

    private static WeakCache weak = CacheUtil.newWeakCache(DateUnit.DAY.getMillis());

    private static LFUFileCache lfuFile = new LFUFileCache(1000, 1000, DateUnit.DAY.getMillis());

    private static LRUFileCache lruFile = new LRUFileCache(1000, 1000, DateUnit.DAY.getMillis());

}
