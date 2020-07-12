package 迭代器模式;

import java.util.List;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/12 17:44
 * @Version: 1.0
 **/
public class MathCollegeIterator implements Iterator {

    //规定数据的存放形式，与对应的 Iterator 中数据的存放方式相同
    private List<Department> mathDepartments;
    //游标
    private int cur;

    public MathCollegeIterator(List<Department> mathDepartments) {
        this.mathDepartments = mathDepartments;
    }

    public MathCollegeIterator(){}

    @Override
    public boolean hasNext() {
        if(cur >= mathDepartments.size()){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        if (hasNext()){
            return mathDepartments.get(cur++);
        }
        return null;
    }
}
