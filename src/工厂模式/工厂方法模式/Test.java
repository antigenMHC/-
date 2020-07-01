package 工厂模式.工厂方法模式;


/**
 * @Author: antigenMHC
 * @Date: 2020/7/1 20:42
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) {

        PizzaFactory pizzaFactory = new ChessPizzaFactory();
        Pizza pizza = pizzaFactory.createPizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
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

class HeiHuJiao extends Pizza {

}