package 单例模式.枚举;

/**
 * @Author: antigenMHC
 * @Date: 2020/6/29 8:06
 * @Version: 1.0
 **/
public class EnumSingleton {
    public static void main(String[] args) {

        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;

        System.out.println(instance == instance1);
    }
}

/**
 * 使用枚举实现单例模式，不仅能避免多线程的同步问题，
 * 而且能防止反序列化重新创建新的对象
 */
enum Singleton{
    INSTANCE;
}