package 单例模式.饿汉式.饿汉式之静态变量;

/**
 * @Author: antigenMHC
 * @Date: 2020/6/28 12:56
 * @Version: 1.0
 **/
public class SingletonHungry {
    public static void main(String[] args) {

        Person instance = Person.getInstance();
        Person instance1 = Person.getInstance();

        System.out.println(instance == instance1);
    }
}


class Person{

    /**
     * 1.
     * 私有化构造器，防止 new
     */
    private Person(){

    }

    /**
     * 2.在本类内部创建对象实例
     */
    private final static Person INSTANCE = new Person();

    /**
     *
     * @return: 提供公有的静态方法，返回实例对象
     */
    public static Person getInstance(){
        return INSTANCE;
    }
}
