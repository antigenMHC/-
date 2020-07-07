package 外观模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/7 14:03
 * @Version: 1.0
 **/
public class MachineSystem {

    private static MachineSystem machineSystem = new MachineSystem();

    private MachineSystem(){
        if(machineSystem!=null){
            throw new RuntimeException("不允许该方式创建单例对象");
        }
    }

    public static MachineSystem getInstance(){
        return machineSystem;
    }

    public void start(){
        System.out.println("机器人打开");
    }

    public void move(){
        System.out.println("机器人炒菜");
    }

    public void wash(){
        System.out.println("机器人睡午觉");
    }

    public void halt(){
        System.out.println("机器人关机");
    }
}
