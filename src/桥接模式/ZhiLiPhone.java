package 桥接模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/5 8:45
 * @Version: 1.0
 **/
public class ZhiLiPhone extends Phone {

    @Override
    public void color() {
        super.color();
        System.out.println("并且这部还是直立式手机");
    }
}
