package tk.xiezw.siwuxie.common.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiezw
 * @date 2019/9/10
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class R extends HashMap<String, Object> {

    public static R ok() {
        return ok("ok");
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("success", true);
        r.put("msg", msg);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        return ok().put("data", map);
    }

    public static R ok(String msg, Map<String, Object> map) {
        return ok(msg).put("data", map);
    }

    public static R error() {
        return error("error");
    }

    public static R error(String msg) {
        R r = new R();
        r.put("success", false);
        r.put("msg", msg);
        return r;
    }

    @Override
    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }

}
