package 模板模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/11 8:43
 * @Version: 1.0
 **/
public class OnlyCoffee extends CoffeeAbstractClass{
    @Override
    protected void coffeeBean() {
        System.out.println("使用阿拉比卡咖啡豆");
    }

    @Override
    protected void batching() {

    }

    @Override
    protected boolean hookHasBatching() {
        return false;
    }
}
