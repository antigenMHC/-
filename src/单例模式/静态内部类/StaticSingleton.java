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