package 观察者模式.访问者方式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/13 11:21
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        //创建被观察者
        WeatherData weatherData = new WeatherData();
        //注册观察者
        weatherData.registerObsever(new WeatherObsever());
        weatherData.registerObsever(new WeatherObsever());
        weatherData.registerObsever(new AlibabaObsever());
        //更新数据
        weatherData.setData(23.5,34.5,23.1);
    }
}
