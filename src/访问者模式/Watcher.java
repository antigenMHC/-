package 访问者模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/12 9:44
 * @Version: 1.0
 **/

/**
 * 观众
 */
abstract public class Watcher {

    /**
     * 成功票
     */
    abstract public void toAccess(TicketElement accessTicket);

    /**
     * 失败票
     */
    abstract public void toFail(TicketElement failTicket);
}
