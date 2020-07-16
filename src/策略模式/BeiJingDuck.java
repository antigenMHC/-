package 策略模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/16 9:06
 * @Version: 1.0
 **/
public class BeiJingDuck extends Duck {

    public BeiJingDuck(String name) {
        super(name);
        //设置北京鸭能做成北京烤鸭和老鸭汤
        setBeiJingKaoYa(new CanBeiJingKaoYa());
        setLaoYaTang(new CanLaoYaTang());
    }

    @Override
    public void whatDuck() {
        System.out.println("这是"+getName());
    }
}
