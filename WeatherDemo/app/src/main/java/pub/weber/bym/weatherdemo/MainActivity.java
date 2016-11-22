package pub.weber.bym.weatherdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    static String httpUrl = "http://apis.baidu.com/thinkpage/weather_api/suggestion";
    static String httpArg = "location=beijing&language=zh-Hans&unit=c&start=0&days=3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //String s = requestWeather(httpUrl,httpArg);
        Weather.getInstance().requestWeather(httpUrl, httpArg, new Weather.RequestState() {
            @Override
            public void onSuccess(String result) {

                WeatherData weatherData = new Gson().fromJson(result,WeatherData.class);
                if(weatherData != null) {
                    Log.d("result =========", weatherData.toString());
                    Log.d("name =========", weatherData.getResults().get(0).getLocation().getName());
                }
            }

            @Override
            public void onFail() {

            }
        });
//        System.out.print();
    }
}
