package 外观模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/7 14:20
 * @Version: 1.0
 **/
public class SystemFacade {

    /**
     * 引用各个子系统对象
     * */
    private ComputerSystem computerSystem;
    private TVSystem2 tvSystem;
    private MachineSystem machineSystem;

    public SystemFacade() {
        this.computerSystem = ComputerSystem.getInstance();
        this.tvSystem = TVSystem2.getInstance();
        this.machineSystem = MachineSystem.getInstance();
    }

    public void ready(){
        computerSystem.start();
        tvSystem.start();
    }

    public void play(){
        computerSystem.music();
        tvSystem.show();
    }

    public void pause(){
        machineSystem.start();
        machineSystem.move();
        machineSystem.wash();
        machineSystem.halt();
    }

    public void end(){
        computerSystem.halt();
        tvSystem.halt();
    }
}
