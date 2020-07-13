package 观察者模式.普通方案推送版;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/13 8:50
 * @Version: 1.0
 **/

/**
 * 显示当前天气情况
 */
public class Conditions {

    //温度，气压，湿度
    private double temperature;
    private double pressure;
    private double humidity;

    //更新天气情况，在推送下，由 wetherdata 调用
    public void update(double temperature, double pressure, double humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("现在的温度为："+temperature);
        System.out.println("现在的气压为："+pressure);
        System.out.println("现在的湿度为："+humidity);
    }
}
