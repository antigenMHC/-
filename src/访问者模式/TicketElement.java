package 访问者模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/12 9:46
 * @Version: 1.0
 **/
abstract public class TicketElement {

    /**
     * “接受”一个观众投票
     */
    abstract public void accept(Watcher watcher);
}
