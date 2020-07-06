package 组合模式;


/**
 * @Author: antigenMHC
 * @Date: 2020/7/6 19:43
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        //创建学校
        OrganizationComponent university = new University("贵理工", "nb");
        //创建学院
        OrganizationComponent computerCollege = new College("计算机学院", "有这个学院？");
        OrganizationComponent waKuangCollege = new College("挖矿学院", "黄金矿工");

        //创建系
        computerCollege.add(new Department("带数据", "找不到工作"));
        computerCollege.add(new Department("云计算", "学 jsp 的云计算"));

        waKuangCollege.add(new Department("挖钻石", "挖锤子"));
        waKuangCollege.add(new Department("挖黄金", "挖peach"));

        //将学院加入学校
        university.add(computerCollege);
        university.add(waKuangCollege);

        university.printf();
    }
}
