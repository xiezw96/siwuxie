package tk.xiezw.siwuxie.common.util;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.lang.Dict;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;

/**
 * @author xiezw
 * @date 2019/9/10
 */
public class Weather {

    private static final String WEATHER_URL = "https://www.tianqiapi.com/api/";
    private static final String WEATHER_ID = "73519664";
    private static final String WEATHER_SECRET = "8TuslXeM";
    private static final String WEATHER_VERSION_FORECAST = "v1";
    private static final String WEATHER_VERSION_LIVE = "v6";

    private static String api(String version, String city) {
        Dict paramDict = Dict.create()
                .set("appid", WEATHER_ID)
                .set("appsecret", WEATHER_SECRET)
                .set("version", version)
                .set("city", city);
        String result = HttpUtil.get(WEATHER_URL, paramDict);
        Dict dict = JSONUtil.toBean(result, Dict.class);
        if (city.equals(dict.get("city"))) {
            return result;
        }
        return null;
    }

    private static String getInfo(String version, String city, String key) {
        String value = Redis.get(key);
        if (value == null) {
            value = api(version, city);
            if (value != null) {
                Redis.set(key, value, DateUnit.HOUR.getMillis() * 3);
            }
        }
        return value;
    }

    public static String getForecastInfo(String city) {
        String key = Constant.REDIS_WEATHER_FORECAST + city;
        return getInfo(WEATHER_VERSION_FORECAST, city, key);
    }

    public static String getLiveInfo(String city) {
        String key = Constant.REDIS_WEATHER_LIVE + city;
        return getInfo(WEATHER_VERSION_LIVE, city, key);
    }

}
