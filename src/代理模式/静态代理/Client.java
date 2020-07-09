package 代理模式.静态代理;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/8 23:06
 * @Version: 1.0
 **/
public class Client {

    public static void main(String[] args) {

        //创建被代理对象
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象，同时将被代理对象传入
        TeacherProxy teacherProxy = new TeacherProxy(teacherDao);
        teacherProxy.teach();
    }
}
