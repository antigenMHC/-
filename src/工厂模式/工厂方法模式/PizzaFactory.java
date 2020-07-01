package 工厂模式.工厂方法模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/1 20:48
 * @Version: 1.0
 **/

/**
 * 只定义规范
 */
abstract public class PizzaFactory {


    abstract public Pizza createPizza();

}

class ChessPizzaFactory extends PizzaFactory{

    @Override
    public Pizza createPizza() {
        ChessPizza chessPizza = new ChessPizza();
        chessPizza.setName("起司");
        return chessPizza;
    }
}

class GreekPizzaFactory extends PizzaFactory{


    @Override
    public Pizza createPizza() {
        GreekPizza greekPizza = new GreekPizza();
        greekPizza.setName("希腊");
        return greekPizza;
    }
}

class HeiHuJiaoPizzaFactory extends PizzaFactory{

    @Override
    public Pizza createPizza() {
        HeiHuJiao heiHuJiao = new HeiHuJiao();
        heiHuJiao.setName("黑胡椒");
        return heiHuJiao;
    }
}