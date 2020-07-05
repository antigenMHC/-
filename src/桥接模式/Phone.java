package 桥接模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/5 8:33
 * @Version: 1.0
 **/
abstract public class Phone {

    //持有行为实现接口的引用，以使用其实现类
    private Brand brand;

    public Phone(Brand brand){
        this.brand = brand;
    }

    public Phone(){}

    public void color(){
        brand.color();
    }
}
