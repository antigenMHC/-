package 命令模式.普通命令模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/11 21:01
 * @Version: 1.0
 **/
public class FridgeCloseCommond implements Commond {

    private FridgeRecevier fridgeRecevier;

    public FridgeCloseCommond(FridgeRecevier fridgeRecevier){
        this.fridgeRecevier = fridgeRecevier;
    }

    @Override
    public void execute() {
        fridgeRecevier.close();
    }

    @Override
    public void undo() {
        fridgeRecevier.on();
    }
}
