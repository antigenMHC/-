package 中介者模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/13 21:34
 * @Version: 1.0
 **/
public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        this.getMediator().register(this, name);
    }

    @Override
    void sendMessage(String name) {
        this.getMediator().getMessage(name);
    }
}
