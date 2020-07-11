package 命令模式.普通命令模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/11 19:15
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        //创建命令接收者
        TVRecevier tvRecevier = new TVRecevier();
        //创建命令
        TVOnCommond tvOnCommond = new TVOnCommond(tvRecevier);
        TVCloseCommond tvCloseCommond = new TVCloseCommond(tvRecevier);
        //组装到遥控器上, 并设置相关命令
        RemoteController remoteController = new RemoteController();
        remoteController.setCommond(0, tvOnCommond, tvCloseCommond);
        remoteController.onButton(0);
        remoteController.closeButton(0);
        remoteController.undoButton();

        System.out.println("------------------");
        //创建冰箱命令接收者
        FridgeRecevier fridgeRecevier = new FridgeRecevier();
        FridgeCloseCommond fridgeCloseCommond = new FridgeCloseCommond(fridgeRecevier);
        FridgeOnCommond fridgeOnCommond = new FridgeOnCommond(fridgeRecevier);
        //组装到遥控器上
        remoteController.setCommond(1, fridgeOnCommond, fridgeCloseCommond);
        remoteController.onButton(1);
        remoteController.closeButton(1);
        remoteController.undoButton();
    }
}
