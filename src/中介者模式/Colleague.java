package 中介者模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/13 21:29
 * @Version: 1.0
 **/

/**
 * 同事抽象类
 */
abstract public class Colleague {

    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    abstract void sendMessage(String name);

    public Mediator getMediator(){
        return this.mediator;
    }
}
