package 职责链模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/17 10:20
 * @Version: 1.0
 **/
public class ViceSchoolMasterApprover extends Approver {

    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        if(request.getPrice() > 10000 && request.getPrice() <= 30000){
            System.out.print("申请编号："+request.getId()+"，");
            System.out.println("副校长"+name+"审批 > 1w 并 <= 3w 的费用");
        }else{
            System.out.println("副校长"+name+"没这个权限");
            successor.processRequest(request);
        }
    }
}
