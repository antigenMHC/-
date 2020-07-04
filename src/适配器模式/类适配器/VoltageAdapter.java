package 适配器模式.类适配器;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/4 9:23
 * @Version: 1.0
 **/
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5v() {
        //获取到 220v 电压
        int src = output220V();
        //转为 5v
        int des = src / 44;
        System.out.println("电压转为了：" + des + "V");
        return des;
    }
}
