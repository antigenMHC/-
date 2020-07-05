package 装饰者模式.Component;

import 装饰者模式.Drink;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/5 19:21
 * @Version: 1.0
 **/
public class Coffee extends Drink {

    @Override
    public double cost() {
        return super.getPrice();
    }
}
