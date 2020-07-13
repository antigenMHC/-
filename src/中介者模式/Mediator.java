package 中介者模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/13 21:11
 * @Version: 1.0
 **/
abstract public class Mediator {

    /**
     * 将中介者对象加入到 Map 中
     * @param colleague：值
     * @param name：键
     */
    abstract public void register(Colleague colleague, String name);

    /**
     * 接收消息，具体的同事类发出的。是处理逻辑的核心方法
     */
    abstract public void getMessage(String name);

}
