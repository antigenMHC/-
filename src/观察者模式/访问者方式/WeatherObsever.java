package 观察者模式.访问者方式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/13 10:47
 * @Version: 1.0
 **/
public class WeatherObsever implements Obsever {

    //温度，气压，湿度
    private double temperature;
    private double pressure;
    private double humidity;

    //更新天气情况
    @Override
    public void update(WeatherData weatherData){
        this.temperature = weatherData.getTemperature();
        this.pressure = weatherData.getPressure();
        this.humidity = weatherData.getHumidity();
        display();
    }

    public void display(){
        System.out.println("现在的温度为："+temperature);
        System.out.println("现在的气压为："+pressure);
        System.out.println("现在的湿度为："+humidity);
    }
}
