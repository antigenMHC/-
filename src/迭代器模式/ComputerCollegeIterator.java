package 迭代器模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/12 17:44
 * @Version: 1.0
 **/
public class ComputerCollegeIterator implements Iterator {

    //规定数据的存放形式，与对应的 Iterator 中数据的存放方式相同
    private Department[] departments;
    private int cur;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }
    public ComputerCollegeIterator(){}

    @Override
    public boolean hasNext() {
        if(cur >= departments.length || departments[cur] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        if (hasNext()){
            return departments[cur++];
        }
        return null;
    }
}
