package 观察者模式.普通方案推送版;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/13 8:49
 * @Version: 1.0
 **/

/**
 * 天气数据类
 */

/**
 * 包含最新的天气数据
 * 包含接收推送信息的对象
 * 当数据有更新时，就主动调用接收推送消息的对象的 update 方法，
 *  将最新的数据传入
 */
public class WeatherData {

    //温度，气压，湿度，接收推送信息的网站
    private double temperature;
    private double pressure;
    private double humidity;
    private Conditions condition;

    public WeatherData(Conditions condition){
        this.condition = condition;
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

    public void dataChange(){
        condition.update(getTemperature(), getPressure(), getHumidity());
    }
    //三个数据同时更新时，调用接收者的 update 方法
    public void setData(double temperature, double pressure, double humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }
}
