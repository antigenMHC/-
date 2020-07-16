package 策略模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/16 9:22
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        Duck peiKing = new BeiJingDuck("北京鸭");
        peiKing.whatDuck();
        peiKing.canBeiJinKaoYa();
        peiKing.canLaoYaTang();

        Duck toyDuck = new ToyDuck("玩具鸭");
        toyDuck.whatDuck();
        toyDuck.canLaoYaTang();
        toyDuck.canBeiJinKaoYa();
    }
}
