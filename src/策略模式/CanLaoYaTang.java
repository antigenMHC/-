package 策略模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/16 9:04
 * @Version: 1.0
 **/
public class CanLaoYaTang implements LaoYaTang {
    @Override
    public void doDuck() {
        System.out.println("够老！能做老鸭汤");
    }
}
