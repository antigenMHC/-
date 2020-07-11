package 模板模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/10 20:20
 * @Version: 1.0
 **/
abstract public class CoffeeAbstractClass {

    public void template(){
        coffeeBean();
        grind();
        cook();
        if(hookHasBatching())
            batching();
    }

    abstract protected void coffeeBean();

    private void grind(){
        System.out.println("研磨咖啡豆");
    }

    private void cook(){
        System.out.println("蒸煮咖啡豆");
    }

    abstract protected void  batching();

    //钩子方法：决定是否添加配料, 默认是要加的
    protected boolean hookHasBatching(){
        return true;
    };
}
