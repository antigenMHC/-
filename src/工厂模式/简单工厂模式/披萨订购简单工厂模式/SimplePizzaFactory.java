package 工厂模式.简单工厂模式.披萨订购简单工厂模式;


/**
 * @Author: antigenMHC
 * @Date: 2020/6/29 17:29
 * @Version: 1.0
 **/
public class SimplePizzaFactory {

    /**
     *
     * @param orderType: 订购的pizza类型
     * @return：通过pizza类型创建的pizza对象
     */
    public static Pizza createPizza(String orderType){
        Pizza pizza = null;
        if("greek".equals(orderType)){
            pizza = new GreekPizza();
            pizza.setName("希腊");
        }else if("cheese".equals(orderType)){
            pizza = new ChessPizza();
            pizza.setName("起司");
        }else if("prepper".equals(orderType)){
            pizza = new HeiHuJiao();
            pizza.setName("黑胡椒");
        }

        return pizza;
    }

}
