package 命令模式.宏命令模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/11 21:50
 * @Version: 1.0
 **/
public class CloseFridgeCommond implements Commond {

    private FridgeRecevier fridge;

    public CloseFridgeCommond(FridgeRecevier fridge){
        this.fridge = fridge;
    }

    @Override
    public void execute() {
       fridge.close();
    }
}
