package 享元模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/8 14:11
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        //创建工厂类
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        //客户要一个博客形式的网站
        WebSite blog = webSiteFactory.getConcreteCategory("博客");
        blog.use(new User("张三"));
        //第二个客户也要一个博客形式的网站
        WebSite blog2 = webSiteFactory.getConcreteCategory("博客");
        blog2.use(new User("李四"));

        webSiteFactory.getPoolSize();

        Integer x = Integer.valueOf(127);
        Integer y = Integer.valueOf(127);

        Integer z = Integer.valueOf(256);
        Integer o = Integer.valueOf(256);

        System.out.println(x==y);
        System.out.println(z==o);

    }
}
