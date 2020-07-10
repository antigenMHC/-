package 代理模式.动态代理;

import 代理模式.静态代理.TeacherProxy;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/9 11:31
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        TeacherDao target = new TeacherDao();
        //创建代理对象
        ProxyFactory factory = new ProxyFactory(target);
        ITeacherDao instance = (ITeacherDao)factory.getProxyInstance();

        instance.teach();
    }
}
