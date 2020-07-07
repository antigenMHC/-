package 外观模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/7 10:24
 * @Version: 1.0
 **/
public class TVSystem2 {

    //单例
    private static TVSystem2 tvSystem = new TVSystem2();

    private TVSystem2(){
        if(tvSystem!=null){
            throw new RuntimeException("不允许以该方法创建单例对象");
        }
    }

    public static TVSystem2 getInstance(){
        return tvSystem;
    }

    public void start(){
        System.out.println("电视打开");
    }

    public void show(){
        System.out.println("电视放日剧");
    }

    public void halt(){
        System.out.println("电脑关机");
    }
}
