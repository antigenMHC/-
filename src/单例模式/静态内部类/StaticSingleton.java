package 单例模式.静态内部类;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: antigenMHC
 * @Date: 2020/6/28 23:14
 * @Version: 1.0
 **/
public class StaticSingleton {
    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);
    }
}

/**
 * 采用了类加载机制来保证初始化单例对象时只有一个线程，
 * 同时由于静态属性只有在类第一次加载时才会初始化，
 * 所以 JVM 保证了线程的安全性。
 *
 * 基于静态内部类在外部类加载时不会被加载的特性，
 * 我们只用在需要时调用 getInstance() 方法，在其中加载静态内部类，
 * 从而实例化单例对象并将其返回即可。
 * 保证了懒加载
 */
class Singleton{

    private Singleton(){}

    /**
     * 静态内部类
     */
    private static class GetSingleton{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){

        return GetSingleton.INSTANCE;
    }
}