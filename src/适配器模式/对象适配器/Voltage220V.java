package 适配器模式.对象适配器;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/4 9:32
 * @Version: 1.0
 **/
public class Voltage220V {

    public int output220V(){
        int src = 220;
        System.out.println("电压：" + src + "V");
        return src;
    }
}
