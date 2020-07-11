package 模板模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/10 20:26
 * @Version: 1.0
 **/
public class ArabicaCoffee extends CoffeeAbstractClass {
    @Override
    protected void coffeeBean() {
        System.out.println("使用阿拉比卡咖啡豆");
    }

    @Override
    protected void batching() {
        System.out.println("使用卡布奇诺调料");
    }

}
