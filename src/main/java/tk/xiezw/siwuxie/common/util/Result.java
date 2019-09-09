package tk.xiezw.siwuxie.common.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiezw
 * @date 2019/9/10
 */
public class Result extends HashMap<String, Object> {

    public static Result ok(String msg) {
        Result r = new Result();
        r.put("success", true);
        r.put("msg", msg);
        return r;
    }

    public static Result ok(String msg, Map<String, Object> map) {
        return ok(msg).put("data", map);
    }

    public static Result error(String msg) {
        Result r = new Result();
        r.put("success", false);
        r.put("msg", msg);
        return r;
    }

    @Override
    public Result put(String key, Object value) {
        super.put(key, value);
        return this;
    }

}
