package 桥接模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/5 8:45
 * @Version: 1.0
 **/
public class FanGaiPhone extends Phone {

    public FanGaiPhone(Brand brand) {
        super(brand);
    }

    public FanGaiPhone() {
        super();
    }

    @Override
    public void color() {
        super.color();
        System.out.println("并且这部还是翻盖手机");
    }
}
