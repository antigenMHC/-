package 装饰者模式.Decorator;

import 装饰者模式.Drink;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/5 19:39
 * @Version: 1.0
 **/
public class SoyDecorator extends PeiLiaoDecorator {

    public SoyDecorator(Drink component) {
        super(component);
        setDec("豆浆");
        setPrice(4.0);
    }
}
