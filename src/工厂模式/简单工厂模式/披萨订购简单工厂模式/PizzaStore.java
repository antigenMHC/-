package 工厂模式.简单工厂模式.披萨订购简单工厂模式;

import java.util.Scanner;

/**
 * @Author: antigenMHC
 * @Date: 2020/6/29 17:28
 * @Version: 1.0
 **/
public class PizzaStore {
    public static void main(String[] args) {

        new PizzaStore().orderPizza();
    }

    public void orderPizza(){

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("请输入要什么pizza：");
            String orderType = scanner.next();

            Pizza pizza = SimplePizzaFactory.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("没这种pizza");
                break;
            }

        }while (true);
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


class ChessPizza extends Pizza {


}

class GreekPizza extends Pizza {


}

class HeiHuJiao extends Pizza{

}