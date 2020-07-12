package 访问者模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/12 9:51
 * @Version: 1.0
 **/
public class ManWatcher extends Watcher {
    @Override
    public void toAccess(TicketElement accessTicket) {
        System.out.println("男人投了成功票");
    }

    @Override
    public void toFail(TicketElement failTicket) {
        System.out.println("男人投了失败票");
    }
}
