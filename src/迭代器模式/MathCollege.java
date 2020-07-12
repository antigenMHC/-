package 迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/12 18:05
 * @Version: 1.0
 **/
public class MathCollege implements College {

    private List<Department> departments = new ArrayList<>();

    //返回创建好的迭代器
    @Override
    public Iterator createIterator() {
        return new MathCollegeIterator(departments);
    }

    //增加元素
    @Override
    public void add(Object object) {
        departments.add((Department) object);
    }

    //删除元素
    @Override
    public void remove(Object object) {
        departments.remove(object);
    }

    @Override
    public void getName() {
        System.out.println("理学院");
    }
}
