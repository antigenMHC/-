package 组合模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/6 19:12
 * @Version: 1.0
 **/
public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public void printf() {
        System.out.println(getName()+"::"+getDes());
    }
}
