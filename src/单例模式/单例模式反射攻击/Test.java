package 单例模式.单例模式反射攻击;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * @Author: antigenMHC
 * @Date: 2020/6/30 9:44
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        /*
        Class<Singleton> singletonClass = Singleton.class;
        //通过反射获得构造器对象
        Constructor<Singleton> constructor = singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        //饿汉式获取一个单例对象
        Singleton instance = Singleton.getInstance();

        Singleton newInstance = constructor.newInstance();

        System.out.println(newInstance == instance);
        */

        //静态内部类获取一个单例对象
        /*StaticSingleton staticInstance = StaticSingleton.getInstance();
        //通过反射获得构造器对象
        Class<StaticSingleton> staticSingletonClass = StaticSingleton.class;

        Constructor<StaticSingleton> constructor2 = staticSingletonClass.getDeclaredConstructor();
        constructor2.setAccessible(true);

        StaticSingleton newInstance2 = constructor2.newInstance();

        System.out.println(newInstance2 == staticInstance);*/

        //通过反射获得对象
        Class<LazySingleton> lazySingleton = LazySingleton.class;

        Constructor<LazySingleton> constructor = lazySingleton.getDeclaredConstructor();
        constructor.setAccessible(true);


        LazySingleton singleton = constructor.newInstance();
        //获得单例对象
        LazySingleton instance = LazySingleton.getInstance();


        System.out.println(instance == singleton);
    }

}

class Singleton{

    private Singleton(){
        /*这种防御反射攻击的方法，对饿汉式和静态内部类是有效的
        * 因为对象在类加载时就已经初始化了
        **/
        if(INSTANCE != null){
            throw  new RuntimeException("单例构造器禁止反射调用");
        }
    }

    private final static Singleton INSTANCE = new Singleton();

    public static Singleton getInstance(){
        return INSTANCE;
    }

}

class StaticSingleton{

    private StaticSingleton(){
        /*这种防御反射攻击的方法，对饿汉式和静态内部类是有效的
         * 因为对象在类加载时就已经初始化了
         **/
        if(GetSingleton.INSTANCE != null){
            throw  new RuntimeException("单例构造器禁止反射调用");
        }
    }

    /**
     * 静态内部类
     */
    private static class GetSingleton{
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    public static StaticSingleton getInstance(){

        return GetSingleton.INSTANCE;
    }
}

class LazySingleton{
    private static LazySingleton instance;

    private LazySingleton(){
        //懒加载下防止反射攻击的可能方案
        if (!Thread.currentThread().getStackTrace()[2].getMethodName().equals("getInstance")) {
            throw new RuntimeException("不允许创建单例对象");
        }
    }

    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            return instance = new LazySingleton();
        }
        return instance;
    }
}