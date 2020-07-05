package 桥接模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/5 8:51
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        //翻盖的小米手机 (样式+品牌)
        FanGaiPhone fanGaiPhone = new FanGaiPhone(new MiBrand());
        fanGaiPhone.color();

        //翻盖的华为手机
        FanGaiPhone fanGaiPhone1 = new FanGaiPhone(new HWBrand());
        fanGaiPhone1.color();

    }
}
