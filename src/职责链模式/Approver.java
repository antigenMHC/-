package 职责链模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/17 9:17
 * @Version: 1.0
 **/
abstract public class Approver {

    //下一个处理者
    Approver successor;

    //名字
    String name;

    public Approver(String name) {
        this.name = name;
    }

    /**
     * 设置下一个处理者
     */
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    /**
     * 处理请求的方法，具体交给子类完成
     */
    abstract void processRequest(PurchaseRequest request);
}
