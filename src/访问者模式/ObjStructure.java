package 访问者模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/12 9:58
 * @Version: 1.0
 **/

import java.util.ArrayList;
import java.util.List;

/**
 * 结构对象
 */
public class ObjStructure {

    private List<TicketElement> tickets;

    public ObjStructure(){
        tickets = new ArrayList<>();
    }

    /**
     * 添加一种种类的票
     * @param ticketElement
     */
    public void addTicketType(TicketElement ticketElement){
        tickets.add(ticketElement);
    }

    /**
     * 输出访问者可以访问的所有票
     * @param watcher
     */
    public void action(Watcher watcher){
        for (TicketElement ticket : tickets) {
            ticket.accept(watcher);
        }
    }
}
