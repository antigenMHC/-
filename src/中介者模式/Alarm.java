package 中介者模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/13 21:33
 * @Version: 1.0
 **/
public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        this.getMediator().register(this, name);
    }

    @Override
    void sendMessage(String name) {
        this.getMediator().getMessage(name);
    }
}
