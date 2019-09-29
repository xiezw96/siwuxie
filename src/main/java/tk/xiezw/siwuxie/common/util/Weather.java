package tk.xiezw.siwuxie.common.util;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.lang.Dict;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
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

    private static String api(String version, String cityId) {
        Dict paramDict = Dict.create()
                .set("appid", WEATHER_ID)
                .set("appsecret", WEATHER_SECRET)
                .set("version", version)
                .set("cityid", cityId);
        return HttpUtil.get(WEATHER_URL, paramDict);
    }

    public static String getForecastInfo(String city) {

        return api(WEATHER_VERSION_FORECAST, city);
    }

    public static String getLiveInfo(String city) {
        return api(WEATHER_VERSION_LIVE, city);
    }

    public static void main(String[] args) {
        FileReader fileReader = new FileReader("json/city.json");
        JSONArray jsonArray = JSONUtil.parseArray(fileReader.readString());
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);

        }
    }

}
