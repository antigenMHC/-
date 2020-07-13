package 中介者模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/13 21:39
 * @Version: 1.0
 **/
public class ConcreteMediator extends Mediator {

    Map<String, Colleague> colleagues;

    public ConcreteMediator(){
        colleagues = new HashMap<>();
    }

    @Override
    public void register(Colleague colleague, String name) {
        colleagues.put(name, colleague);
    }

    /**
     * 根据得到的消息完成对应的任务,协调具体的同事对象
     */
    @Override
    public void getMessage(String name) {

        //闹钟发出消息，说明咖啡机该开始弄咖啡了。以此类推
        if(colleagues.get(name) instanceof Alarm){
            System.out.println("闹钟响起");
        }else if(colleagues.get(name) instanceof CoffeeMachine){
            System.out.println("咖啡机开始弄咖啡");
        }else if(colleagues.get(name) instanceof Curtain){
            System.out.println("窗帘落下");
        }else if(colleagues.get(name) instanceof TV){
            System.out.println("电视打开");
        }
    }
}
