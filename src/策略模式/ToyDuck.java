package 策略模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/16 9:07
 * @Version: 1.0
 **/
public class ToyDuck extends Duck {

    public ToyDuck(String name) {
        super(name);
        //设置玩具鸭不能做成北京烤鸭和老鸭汤
        setBeiJingKaoYa(new NotBeiJingKaoYa());
        setLaoYaTang(new NotLaoYaTang());
    }

    @Override
    public void whatDuck() {
        System.out.println("这是"+getName());
    }
}
