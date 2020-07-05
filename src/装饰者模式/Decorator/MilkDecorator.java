package 装饰者模式.Decorator;

import 装饰者模式.Drink;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/5 19:39
 * @Version: 1.0
 **/
public class MilkDecorator extends PeiLiaoDecorator {

    public MilkDecorator(Drink component) {
        super(component);
        setDec("牛奶");
        setPrice(3.0);
    }
}
