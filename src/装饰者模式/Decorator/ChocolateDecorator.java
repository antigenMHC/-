package 装饰者模式.Decorator;

import 装饰者模式.Drink;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/5 19:40
 * @Version: 1.0
 **/
public class ChocolateDecorator extends PeiLiaoDecorator {

    public ChocolateDecorator(Drink component) {
        super(component);
        setDec("巧克力");
        setPrice(5.0);
    }
}
