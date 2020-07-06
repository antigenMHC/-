package 组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/6 18:20
 * @Version: 1.0
 **/
public class University extends OrganizationComponent {

    //聚合子结点, 这里的List存的就是学院
    List<OrganizationComponent> sonNode = new ArrayList<>();

    public University(String name, String des) {
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
