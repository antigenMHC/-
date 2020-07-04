package 适配器模式.类适配器;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/4 9:40
 * @Version: 1.0
 **/
public class Phone {

    public void chongDian(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5v() == 5){
            System.out.println("开始充电");
        }else if(iVoltage5V.output5v() > 5){
            System.out.println("充爆了");
        }else{
            System.out.println("电压不足，充得很慢");
        }
    }
}
