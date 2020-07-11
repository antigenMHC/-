package 命令模式.宏命令模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/11 21:46
 * @Version: 1.0
 **/
public class PushFoodCommond implements Commond {

    FridgeRecevier fridge;

    public PushFoodCommond(FridgeRecevier fridge){
        this.fridge = fridge;
    }

    @Override
    public void execute() {
        fridge.pushFood();
    }
}
