package 外观模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/7 14:13
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        SystemFacade systemFacade = new SystemFacade();
        systemFacade.ready();
        systemFacade.play();
        systemFacade.pause();
        systemFacade.end();
    }
}
