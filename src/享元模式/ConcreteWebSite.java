package 享元模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/8 13:50
 * @Version: 1.0
 **/
public class ConcreteWebSite extends WebSite {

    //具体的网站类型
    private String type;

    public ConcreteWebSite(String type){
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("用户："+user.getName()+"使用"+type+"网页"+", 正在运行中");
    }
}
