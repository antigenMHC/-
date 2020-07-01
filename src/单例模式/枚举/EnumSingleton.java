package 单例模式.枚举;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: antigenMHC
 * @Date: 2020/6/29 8:06
 * @Version: 1.0
 **/
public class EnumSingleton {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {

        /*Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;

        System.out.println(instance == instance1);*/

        /*Singleton instance = Singleton.INSTANCE;
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        Singleton newInstance = (Singleton) ois.readObject();

        System.out.println(instance == newInstance);*/

        Class<Singleton> singletonClass = Singleton.class;
        //通过反射获得构造器对象，通过传入 Class 对象指定构造器
        Constructor<Singleton> constructor = singletonClass.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        //饿汉式获取一个单例对象
        Singleton instance = Singleton.INSTANCE;

        Singleton newInstance = constructor.newInstance("mhc", 666);

        System.out.println(newInstance == instance);
    }
}

/**
 * 使用枚举实现单例模式，不仅能避免多线程的同步问题，
 * 而且能防止反序列化重新创建新的对象
 */
enum Singleton{
    INSTANCE;
}