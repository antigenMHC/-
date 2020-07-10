package 代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/9 11:11
 * @Version: 1.0
 **/
public class ProxyFactory {

     //聚合被代理对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //根据被代理对象生成代理对象
    public Object getProxyInstance(){

        //参数说明
        //loader：指定当前被代理对象的类加载器
        //interfaces：被代理对象实现的接口类型
        //h：事件处理，执行被代理对象的方法时，触发事件处理器的方法，
          // 会把当前执行的被代理对象方法作为参数传入
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("动态代理开始");
                        Object re = method.invoke(target, args);
                        System.out.println("动态代理结束");
                        return re;
                    }
                });

    }
}
