package tk.xiezw.siwuxie.common.util;

import cn.hutool.core.lang.Dict;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;

/**
 * @author xiezw
 * @date 2019/9/10
 */
public class Weather {

    private static final String WEATHER_APP_URL = "https://www.tianqiapi.com/api/";
    private static final String WEATHER_APP_ID = "73519664";
    private static final String WEATHER_APP_SECRET = "8TuslXeM";
    private static final String WEATHER_APP_VERSION = "v1";

    public static String getWeatherInfo(String city) {
        if (StrUtil.isNotBlank(city)) {
            Dict paramDict = Dict.create()
                    .set("appid", WEATHER_APP_ID)
                    .set("appsecret", WEATHER_APP_SECRET)
                    .set("version", WEATHER_APP_VERSION)
                    .set("city", city);
            Dict resultDict = JSONUtil.toBean(HttpUtil.get(WEATHER_APP_URL, paramDict), Dict.class);
            if (city.equals(resultDict.get("city"))) {
                return resultDict.get("data").toString();
            }
        }
        return null;
    }

}
