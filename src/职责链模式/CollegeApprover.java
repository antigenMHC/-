package 职责链模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/17 10:15
 * @Version: 1.0
 **/
public class CollegeApprover extends Approver {

    public CollegeApprover(String name){
        super(name);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        if(request.getPrice() > 5000 && request.getPrice() <= 10000){
            System.out.print("申请编号："+request.getId()+"，");
            System.out.println("院长"+name+"审批 > 5k 并 <= 1w 的费用");
        }else{
            System.out.println("院长"+name+"没这个权限");
            successor.processRequest(request);
        }
    }
}
