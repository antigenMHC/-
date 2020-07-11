package 模板模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/10 20:20
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        CoffeeAbstractClass arabicaCoffee = new ArabicaCoffee();
        arabicaCoffee.template();
        System.out.println("-----------------");
        CoffeeAbstractClass robustaCoffee = new RobustaCoffee();
        robustaCoffee.template();
        System.out.println("-----------------");
        CoffeeAbstractClass onlyCoffee = new OnlyCoffee();
        onlyCoffee.template();
    }
}
