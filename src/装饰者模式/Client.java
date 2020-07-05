package 装饰者模式;

import 装饰者模式.Component.Coffee;
import 装饰者模式.Component.DecafCoffee;
import 装饰者模式.Component.LongBlackCoffee;
import 装饰者模式.Decorator.ChocolateDecorator;
import 装饰者模式.Decorator.MilkDecorator;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/5 19:53
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        //点了一份 LongBlack + 一份牛奶 + 两份巧克力

        Drink order = new LongBlackCoffee();

        order = new MilkDecorator(order);
        order = new ChocolateDecorator(order);
        order = new ChocolateDecorator(order);

        System.out.println(order.cost());
        System.out.println(order.getDec());

    }
}
