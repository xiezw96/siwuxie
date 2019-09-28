package tk.xiezw.siwuxie.common.util;

import cn.hutool.db.nosql.redis.RedisDS;
import redis.clients.jedis.Jedis;

/**
 * @author xiezw
 * @date 2019/9/10
 */
public class Redis {

    private static Jedis jedis = RedisDS.create().getJedis();

}
