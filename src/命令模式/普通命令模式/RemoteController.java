package 命令模式.普通命令模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/11 19:12
 * @Version: 1.0
 **/
public class RemoteController {

    private Commond[] onCommonds;
    private Commond[] closeCommonds;
    private Commond unDoCommonds;

    public RemoteController(){
        onCommonds = new Commond[6];
        closeCommonds = new Commond[6];
    }

    //设置一组命令，num代表第是给第num个电器设置命令
    public void setCommond(int num, Commond onCommond,
                           Commond closeCommond){
        this.onCommonds[num] = onCommond;
        this.closeCommonds[num] =closeCommond;
    }

    //按下了第num个电器的开按钮
    public void onButton(int num){
        onCommonds[num].execute();
        //记录本次操作
        unDoCommonds = onCommonds[num];
    }

    public void closeButton(int num){
        closeCommonds[num].execute();
        unDoCommonds = closeCommonds[num];
    }

    //按下撤销按钮的处理，如果保存的是开的命令，那么就会执行关的命令
    public void undoButton(){
        unDoCommonds.undo();
    }
}
