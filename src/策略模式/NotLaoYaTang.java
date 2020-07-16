package 策略模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/16 9:03
 * @Version: 1.0
 **/
public class NotLaoYaTang implements LaoYaTang{
    @Override
    public void doDuck() {
        System.out.println("做不了老鸭汤");
    }
}
