package 适配器模式.对象适配器;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/4 9:23
 * @Version: 1.0
 **/
public class VoltageAdapter implements IVoltage5V {

    //持有被适配类
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }
    public VoltageAdapter(){}

    @Override
    public int output5v() {

        int des = 0;

        //获取到 220v 电压
        if(voltage220V != null){
            int src = voltage220V.output220V();
            //转为 5v
            des = src / 44;
        }
        System.out.println("电压通过对象适配器转为了：" + des + "V");
        return des;
    }
}
