package 外观模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/7 10:24
 * @Version: 1.0
 **/
public class ComputerSystem {

    //单例
    private static ComputerSystem computerSystem = new ComputerSystem();

    private ComputerSystem(){
        if(computerSystem!=null){
            throw new RuntimeException("单例对象不允许如此创建");
        }
    }

    public static ComputerSystem getInstance() {
        return computerSystem;
    }

    public void start(){
        System.out.println("电脑打开");
    }

    public void music(){
        System.out.println("电脑播放音乐");
    }

    public void halt(){
        System.out.println("电脑关机");
    }
}
