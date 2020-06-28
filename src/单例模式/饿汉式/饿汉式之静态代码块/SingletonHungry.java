package 单例模式.饿汉式.饿汉式之静态代码块;

/**
 * @Author: antigenMHC
 * @Date: 2020/6/28 13:58
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

    private static Person instance;

    private Person(){}

    /**
     * 在静态代码块中初始化单例对象
     */
    static{
        instance = new Person();
    }

    public static Person getInstance(){
        return instance;
    }
}
