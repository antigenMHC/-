package 工厂模式.简单工厂模式.披萨订购原始版;

import java.util.Scanner;

/**
 * @Author: antigenMHC
 * @Date: 2020/6/29 14:09
 * @Version: 1.0
 **/
public class PizzaStore {

    public static void main(String[] args) {

        //发出披萨订购任务
        new PizzaStore().OrderPizza();
    }

    public void OrderPizza(){
        Pizza pizza = null;
        String orderType;
        do {
            System.out.print("输入订购的pizza种类：");
            orderType = new Scanner(System.in).next();

            if("greek".equals(orderType)){
                pizza = new GreekPizza();
                pizza.setName("希腊");
            }else if("cheese".equals(orderType)){
                pizza = new ChessPizza();
                pizza.setName("起司");
            }else{
                break;
            }

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);
    }
}


abstract class Pizza{

    protected String name;

    void prepare() {
        System.out.println("准备"+name+"披萨的原材料");
    }

    void bake() {
        System.out.println(name+"披萨进行烘焙");
    }

    void cut() {
        System.out.println(name+"披萨进行切分");
    }

    void box() {
        System.out.println(name+"披萨进行装箱");
    }

    public void setName(String name){
        this.name = name;
    }
}


class ChessPizza extends Pizza{


}

class GreekPizza extends Pizza{


}