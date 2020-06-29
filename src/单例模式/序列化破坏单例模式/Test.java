package 单例模式.序列化破坏单例模式;

import java.io.*;

/**
 * @Author: antigenMHC
 * @Date: 2020/6/29 20:21
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Singleton instance = Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        Singleton newInstance = (Singleton) ois.readObject();

        System.out.println(instance == newInstance);
    }
}


class Singleton implements Serializable{

    /**
     * 1.
     * 私有化构造器，防止 new
     */
    private Singleton(){

    }

    /**
     * 2.在本类内部创建对象实例
     */
    private final static Singleton INSTANCE = new Singleton();

    /**
     *
     * @return: 提供公有的静态方法，返回实例对象
     */
    public static Singleton getInstance(){
        return INSTANCE;
    }

    /**
     * 只需加上这个方法，就可以防止序列化破坏单例模式
     * @return
     */
    private Object readResolve(){
        return INSTANCE;
    }
}
