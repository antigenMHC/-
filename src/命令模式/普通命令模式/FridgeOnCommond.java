package 命令模式.普通命令模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/11 21:01
 * @Version: 1.0
 **/
public class FridgeOnCommond implements Commond {

    private FridgeRecevier fridgeRecevier;

    public FridgeOnCommond(FridgeRecevier fridgeRecevier){
        this.fridgeRecevier = fridgeRecevier;
    }

    @Override
    public void execute() {
        fridgeRecevier.on();
    }

    @Override
    public void undo() {
        fridgeRecevier.close();
    }
}
