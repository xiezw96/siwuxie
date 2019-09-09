package tk.xiezw.siwuxie.common.util;

import java.util.HashMap;

/**
 * @author xiezw
 * @date 2019/9/10
 */
public class R extends HashMap<String, Object> {

    public static R ok(String msg) {
        R r = new R();
        r.put("success", true);
        r.put("msg", msg);
        return r;
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
