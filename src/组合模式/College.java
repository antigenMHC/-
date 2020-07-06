package 组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/6 18:41
 * @Version: 1.0
 **/
public class College extends OrganizationComponent {

    //这个 List 存的其实是 department
    List<OrganizationComponent> sonNode = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }



    //重写 add
    @Override
    protected void add(OrganizationComponent component) {
        sonNode.add(component);
    }

    //重写 remove
    @Override
    protected void remove(OrganizationComponent component) {
        sonNode.remove(component);
    }


    //输出 university 中包含的学院
    @Override
    public void printf() {
        System.out.println("-------------"+getName()+"------------");
        for (OrganizationComponent component : sonNode) {
            component.printf();
        }
    }
}
