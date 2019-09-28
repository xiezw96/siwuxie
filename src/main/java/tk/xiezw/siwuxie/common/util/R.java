package tk.xiezw.siwuxie.common.util;

import java.util.LinkedHashMap;

/**
 * @author xiezw
 * @date 2019/9/10
 */
public class R extends LinkedHashMap<String, Object> {

    public static R ok() {
        return R.ok("返回成功！");
    }

    public static R ok(Object value) {
        R r = new R();
        r.put("success", true);
        r.put("value", value);
        return r;
    }

    public static R error() {
        return R.error("返回失败！");
    }

    public static R error(Object value) {
        R r = new R();
        r.put("success", false);
        r.put("value", value);
        return r;
    }

}
