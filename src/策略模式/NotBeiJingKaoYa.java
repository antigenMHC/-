package 策略模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/16 9:00
 * @Version: 1.0
 **/
public class NotBeiJingKaoYa implements BeiJingKaoYa {
    @Override
    public void doDuck() {
        System.out.println("这鸭子八行，不能做成北京烤鸭");
    }
}
