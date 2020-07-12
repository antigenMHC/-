package 访问者模式;

import java.io.ObjectOutputStream;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/12 10:02
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        ObjStructure objStructure = new ObjStructure();
        objStructure.addTicketType(new AccessTicketElement());
        objStructure.addTicketType(new FailTicketElement());

        objStructure.action(new ManWatcher());
        objStructure.action(new WomanWatcher());
    }
}
