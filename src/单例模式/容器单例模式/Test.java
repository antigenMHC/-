package 单例模式.容器单例模式;



import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: antigenMHC
 * @Date: 2020/6/30 20:10
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Th());
        Thread t2 = new Thread(new Th());
        t1.start();
        t2.start();
    }
}


class ContainerSingleton{
    private static Map<String, Object> singletonMap = new HashMap<>();

    private ContainerSingleton(){

    }

    public static void putInstance(String key, Object instance){

        if(StringUtils.isNotBlank(key) && instance != null){
            if(!singletonMap.containsKey(key)){
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }

}


class Th implements Runnable{

    @Override
    public void run() {
        ContainerSingleton.putInstance("object", new Object());
        Object object = ContainerSingleton.getInstance("object");
        System.out.println(Thread.currentThread().getName()+"  "+object);
    }
}

