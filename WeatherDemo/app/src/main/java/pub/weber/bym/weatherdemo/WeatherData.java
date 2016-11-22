package pub.weber.bym.weatherdemo;

import java.util.List;

/**
 * Created by BYM on 2016/11/18.
 */

public class WeatherData {


    private List<ResultData> results;

    public List<ResultData> getResults() {
        return results;
    }

    public void setResults(List<ResultData> results) {
        this.results = results;
    }

    class ResultData{
        private LocationData location;
        private List<DailyData> daily;

        public List<DailyData> getDaily() {
            return daily;
        }

        public void setDaily(List<DailyData> daily) {
            this.daily = daily;
        }

        public LocationData getLocation() {
            return location;
        }

        public void setLocation(LocationData location) {
            this.location = location;
        }

    }




    class LocationData {
        private String id;
        private String name;
        private String country;

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class DailyData {
        private String date;
        private String text_day;
        private String wind_direction;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getText_day() {
            return text_day;
        }

        public void setText_day(String text_day) {
            this.text_day = text_day;
        }

        public String getWind_direction() {
            return wind_direction;
        }

        public void setWind_direction(String wind_direction) {
            this.wind_direction = wind_direction;
        }
    }

}
