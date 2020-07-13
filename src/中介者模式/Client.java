package 中介者模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/13 21:52
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        Mediator mediator = new ConcreteMediator();

        Alarm alarm = new Alarm(mediator, "闹钟");
        CoffeeMachine coffee = new CoffeeMachine(mediator, "咖啡机");
        Curtain curtain = new Curtain(mediator, "窗帘");
        TV tv = new TV(mediator, "电视");

        alarm.sendMessage("闹钟");
        coffee.sendMessage("咖啡机");
        curtain.sendMessage("窗帘");
        tv.sendMessage("电视");
    }
}
