package 观察者模式.访问者方式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/13 10:50
 * @Version: 1.0
 **/
public class WeatherData implements Subject {

    //温度，气压，湿度，接收推送信息的网站
    private double temperature;
    private double pressure;
    private double humidity;
    private List<Obsever> obsevers;

    public WeatherData(){
        obsevers = new ArrayList<>();
    }

    @Override
    public void registerObsever(Obsever obsever) {
        obsevers.add(obsever);
    }

    @Override
    public void removeObsever(Obsever obsever) {
        obsevers.remove(obsever);
    }

    //循环，通知所有的观察者
    @Override
    public void notifyObsever() {
        int i = 0;
        for (Obsever obsever : obsevers) {
            System.out.println("第"+((i++)+1)+"个网站");
            obsever.update(this);
        }
    }

    //三个数据更新后，调用 Notify，更新所有的观察者
    public void setData(double temperature, double pressure, double humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObsever();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}
