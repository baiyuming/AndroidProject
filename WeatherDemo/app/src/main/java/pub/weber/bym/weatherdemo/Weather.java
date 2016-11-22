package pub.weber.bym.weatherdemo;

import android.content.Intent;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 * Created by BYM on 2016/11/18.
 */
class Weather{

    private static Weather mWeather = null;

    /**
     *
     * @return
     */
    public static synchronized Weather getInstance() {
        if (mWeather == null) {
            mWeather = new Weather();
        }
        return mWeather;
    }

    public  void requestWeather(final String httpUrl, final String httpArg,final RequestState state) {
    // 开启线程来发起网络请求
        new Thread(new Runnable() {
            @Override
            public void run() {
                String result = null;
                BufferedReader reader = null;
                StringBuffer sbf = new StringBuffer();
                String allHttpUrl = httpUrl + "?" + httpArg;
                try {
                    URL url = new URL(allHttpUrl);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    // 填入apikey到HTTP header
                    connection.setRequestProperty("apikey",  "ecb3e92326ce878b9028900af5a0aa13");
                    connection.connect();
                    InputStream is = connection.getInputStream();
                    reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                    String strRead = null;
                    while ((strRead = reader.readLine()) != null) {
                        sbf.append(strRead);
                        sbf.append("\r\n");
                    }
                    reader.close();
                    result = sbf.toString();
                    state.onSuccess(result);
                } catch (Exception e) {
                    e.printStackTrace();
                    state.onFail();
                }
            }
        }).start();
    }

    interface RequestState{
        void onSuccess(String result);

        void onFail();
    }
}

