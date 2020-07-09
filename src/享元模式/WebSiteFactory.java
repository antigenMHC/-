package 享元模式;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/8 13:48
 * @Version: 1.0
 **/

/**
 * 网站工厂类，根据需求返回具体网站 concreteWebSite 的对象
 */
public class WebSiteFactory {

    //集合池
    private Map<String, ConcreteWebSite> webSitePool = new HashMap<>();

    //根据网站类型，从池中返回一个网站；如果没有则创建该网站并放入池中，并返回
    public WebSite  getConcreteCategory(String type){
        //判断是否有对应对象在池中
        if(!webSitePool.containsKey(type)){
            webSitePool.put(type, new ConcreteWebSite(type));
            return webSitePool.get(type);
        }
        return webSitePool.get(type);
    }

    //获取网站有哪些类型
    public void getPoolSize(){
        System.out.println(webSitePool.size());
    }
}
