package 代理模式.CGib代理;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/9 23:06
 * @Version: 1.0
 **/
public class Client {

    public static void main(String[] args) {

        //创建被代理对象
        TeacherDao teacherDao = new TeacherDao();
        //获取代理对象
        TeacherDao instance = (TeacherDao)new ProxyFactory2(teacherDao).getProxyInstance();
        instance.teach();
    }
}
