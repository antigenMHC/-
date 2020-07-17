package 职责链模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/17 9:54
 * @Version: 1.0
 **/
public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    /**
     * 如果本类的处理方法能够处理，则交给本类处理，否则将请求递交给下一个
     */
    @Override
    void processRequest(PurchaseRequest request) {
        if(request.getPrice() <= 5000){
            System.out.print("申请编号："+request.getId()+"，");
            System.out.println("教学主任"+name+"审批 <= 5k的费用");
        }else{
            System.out.println("教学主任"+name+"没这个权限");
            successor.processRequest(request);
        }
    }
}
