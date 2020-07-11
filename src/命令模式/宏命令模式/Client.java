package 命令模式.宏命令模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/11 22:01
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        //创建命令接收者
        FridgeRecevier fridge = new FridgeRecevier();
        //创建命令对象
        Commond openFridge = new OpenFridgeCommond(fridge);
        Commond pushFood = new PushFoodCommond(fridge);
        Commond closeFridge = new CloseFridgeCommond(fridge);

        //命令控制对象，充当了调用者和具体命令的双重对象
        MacroCommond macro = new FridgeMacroCommond();
        macro.addCommond(openFridge);
        macro.addCommond(pushFood);
        macro.addCommond(closeFridge);
        //执行宏命令
        macro.execute();
    }
}
