package 装饰者模式.Decorator;

import 装饰者模式.Drink;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/5 19:30
 * @Version: 1.0
 **/
public class PeiLiaoDecorator extends Drink {

    private Drink component;

    //计算出配料的价格和咖啡的价格
    @Override
    public double cost() {
        return this.getPrice() + component.cost();
    }

    public PeiLiaoDecorator(Drink component) {
        this.component = component;
    }

    @Override
    public String getDec() {
        return dec + "" + this.getPrice() +
        "&&" + component.getDec();
    }
}
