package tk.xiezw.siwuxie.common.util;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiezw
 * @date 2019/9/10
 */
public class Weather {

    private final static String WEATHER_APP_URL = "https://www.tianqiapi.com/api/";
    private final static String WEATHER_APP_ID = "73519664";
    private final static String WEATHER_APP_SECRET = "8TuslXeM";
    private final static String WEATHER_APP_VERSION = "v1";

    public static String getWeatherInfo(String city) {
        if (StrUtil.isNotBlank(city)) {
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("appid", WEATHER_APP_ID);
            paramMap.put("appsecret", WEATHER_APP_SECRET);
            paramMap.put("version", WEATHER_APP_VERSION);
            paramMap.put("city", city);
            Map map = JSONUtil.toBean(HttpUtil.get(WEATHER_APP_URL, paramMap), Map.class);
            if (city.equals(map.get("city"))) {
                return map.get("data").toString();
            }
        }
        return null;
    }

}
