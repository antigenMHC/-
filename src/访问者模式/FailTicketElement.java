package 访问者模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/12 9:52
 * @Version: 1.0
 **/
public class FailTicketElement extends TicketElement {
    @Override
    public void accept(Watcher watcher) {
        watcher.toFail(this);
        System.out.println("获得一张失败票");
    }
}
