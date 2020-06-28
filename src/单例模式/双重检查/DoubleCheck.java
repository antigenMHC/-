package 单例模式.双重检查;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: antigenMHC
 * @Date: 2020/6/28 21:40
 * @Version: 1.0
 **/
public class DoubleCheck {
    public static void main(String[] args) {
        SingletonThread singletonThread = new SingletonThread();

        new Thread(singletonThread).start();
        new Thread(singletonThread).start();
        new Thread(singletonThread).start();
        new Thread(singletonThread).start();
        new Thread(singletonThread).start();
    }
}


class Singleton{
    private static volatile Singleton instance;

    private Singleton(){}

    /**
     * 提供一个静态的公有方法，当使用到该方法
     * 并且单例对象没有被创建时才去创建单例对象
     * @return：单例对象
     */
    public static Singleton getInstance(){
        if( instance == null ){
            synchronized (Singleton.class){
                if(instance == null){
                    System.out.println("执行了初始化单例对象的方法");
                    return instance = new Singleton();
                }
            }
        }

        return instance;
    }
}


class SingletonThread implements Runnable{

    //存储单例对象
    Set<Singleton> list= new HashSet<>();

    @Override
    public void run() {
        Singleton instance = Singleton.getInstance();
        list.add(instance);
        System.out.println(list.size());
    }
}