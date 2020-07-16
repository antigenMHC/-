package 策略模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/16 9:01
 * @Version: 1.0
 **/
public class CanBeiJingKaoYa implements BeiJingKaoYa {
    @Override
    public void doDuck() {
        System.out.println("这鸭子，可以啊，做成北京烤鸭吧");
    }
}
