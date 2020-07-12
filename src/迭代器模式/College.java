package 迭代器模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/12 18:03
 * @Version: 1.0
 **/

/**
 * College 就是 department 的聚合对象,容器
 */
public interface College {

    Iterator createIterator();
    void add(Object object);
    void remove(Object object);
    void getName();
}
