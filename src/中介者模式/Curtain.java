package 中介者模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/13 21:35
 * @Version: 1.0
 **/
public class Curtain extends Colleague {

    public Curtain(Mediator mediator, String name) {
        super(mediator, name);
        this.getMediator().register(this, name);
    }

    @Override
    void sendMessage(String name) {
        this.getMediator().getMessage(name);
    }
}
