package 中介者模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/13 21:33
 * @Version: 1.0
 **/
public class CoffeeMachine extends Colleague {

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        //注册自己
        this.getMediator().register(this, name);
    }

    @Override
    void sendMessage(String name) {
        this.getMediator().getMessage(name);
    }
}
