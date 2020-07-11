package 命令模式.普通命令模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/11 17:52
 * @Version: 1.0
 **/
public class TVCloseCommond implements Commond{

    private TVRecevier tvRecevier;

    public TVCloseCommond(TVRecevier tvRecevier){
        this.tvRecevier = tvRecevier;
    }

    @Override
    public void execute() {
        tvRecevier.close();
    }

    @Override
    public void undo() {
        tvRecevier.on();
    }
}
