package 模板模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/10 20:27
 * @Version: 1.0
 **/
public class RobustaCoffee extends CoffeeAbstractClass {
    @Override
    protected void coffeeBean() {
        System.out.println("使用罗伯氏特咖啡豆");
    }

    @Override
    protected void batching() {
        System.out.println("使用低咖配料");
    }


}
