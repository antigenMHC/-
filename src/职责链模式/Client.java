package 职责链模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/17 10:22
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        //新建一个请求
        PurchaseRequest request = new PurchaseRequest(1, 349000, 1);

        //新建一个教学主任处理者
        Approver department = new DepartmentApprover("张三");
        //新建院长处理者
        Approver college = new CollegeApprover("李四");
        //以此类推
        Approver viceSchool = new ViceSchoolMasterApprover("王五");
        Approver schoolManager = new SchooleManagerApprover("赵六");

        //设置传递链，形成环状，这样在任何情况下都会找到一个人去处理请求
        //但是环状并不是必须的，需要视需求而定
        department.setSuccessor(college);
        college.setSuccessor(viceSchool);
        viceSchool.setSuccessor(schoolManager);
        schoolManager.setSuccessor(department);

        //选择给谁发送请求
        department.processRequest(request);
    }
}
