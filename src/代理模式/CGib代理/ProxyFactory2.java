package 代理模式.CGib代理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/9 22:07
 * @Version: 1.0
 **/
public class ProxyFactory2 implements MethodInterceptor {

    private Object target;

    public ProxyFactory2(Object target){
        this.target = target;
    }

    //返回一个代理对象，是 target 的代理对象
    public Object getProxyInstance(){
        //1.创建工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类,即被代理对象
        enhancer.setSuperclass(target.getClass());
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.创建子类对象，即代理对象
        return enhancer.create();
    }

    //重写 intercept，在调用代理对象的方法时触发
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理开始");
        Object re = method.invoke(target, objects);
        System.out.println("cglib代理结束");
        return re;
    }
}
