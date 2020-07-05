package 桥接模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/5 8:29
 * @Version: 1.0
 **/
public class MiBrand implements Brand {


    @Override
    public void color() {
        System.out.print("小米手机是小米色的");
    }
}
