package 工厂模式.抽象工厂模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/2 9:57
 * @Version: 1.0
 **/
public class HeiHuJiaoFactory implements Factory {
    @Override
    public PeiLiao getPeiLiao() {
        HeiHuJiaoPeiLiao HhjPeiLiao = new HeiHuJiaoPeiLiao();
        HhjPeiLiao.setName("黑胡椒");
        return HhjPeiLiao;
    }

    @Override
    public Pizza getPizza() {
        HeiHuJiaoPizza HhjPizza = new HeiHuJiaoPizza();
        HhjPizza.setName("黑胡椒");
        return HhjPizza;
    }
}
