package 迭代器模式;


import java.util.Arrays;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/12 18:04
 * @Version: 1.0
 **/
public class ComputerCollege implements College {

    private Department[] departments = new Department[5];
    private int index = 0;

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }

    @Override
    public void add(Object object) {
        departments[index++] = (Department)object;
    }

    @Override
    public void remove(Object object) {

    }

    @Override
    public void getName() {
        System.out.println("计算机学院");
    }
}
