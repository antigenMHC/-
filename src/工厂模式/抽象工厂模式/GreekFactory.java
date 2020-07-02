package 工厂模式.抽象工厂模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/2 9:57
 * @Version: 1.0
 **/
public class GreekFactory implements Factory {
    @Override
    public PeiLiao getPeiLiao() {
        GreekPeiLiao greekPeiLiao = new GreekPeiLiao();
        greekPeiLiao.setName("希腊");
        return greekPeiLiao;
    }

    @Override
    public Pizza getPizza() {
        GreekPizza greekPizza = new GreekPizza();
        greekPizza.setName("希腊");
        return greekPizza;
    }
}
