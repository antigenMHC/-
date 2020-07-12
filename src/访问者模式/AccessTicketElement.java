package 访问者模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/12 9:52
 * @Version: 1.0
 **/
public class AccessTicketElement extends TicketElement {
    @Override
    public void accept(Watcher watcher) {
        watcher.toAccess(this);
        System.out.println("获得一张成功票");
    }
}
