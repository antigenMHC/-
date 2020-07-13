package 观察者模式.普通方案推送版;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/13 9:23
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        Conditions condition = new Conditions();
        WeatherData weatherData = new WeatherData(condition);
        weatherData.setData(43.2,34.1,45.2);

        System.out.println("---------天气发生变化-----------");

        weatherData.setData(100.2, 12.3, 44.23);
    }
}
