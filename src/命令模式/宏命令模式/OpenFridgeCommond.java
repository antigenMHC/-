package 命令模式.宏命令模式;

import java.util.Collections;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/11 21:44
 * @Version: 1.0
 **/
public class OpenFridgeCommond implements Commond {

    private FridgeRecevier fridge;

    public OpenFridgeCommond(FridgeRecevier fridge){
        this.fridge = fridge;
    }

    @Override
    public void execute() {
        fridge.open();
    }
}
