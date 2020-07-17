package 职责链模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/17 10:22
 * @Version: 1.0
 **/
public class SchooleManagerApprover extends Approver {

    public SchooleManagerApprover(String name) {
        super(name);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        if(request.getPrice() > 30000){
            System.out.print("申请编号："+request.getId()+"，");
            System.out.println("校长"+name+"审批 >3w 的费用");
        }else{
            successor.processRequest(request);
        }
    }
}
