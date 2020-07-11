package 命令模式.普通命令模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/11 17:51
 * @Version: 1.0
 **/
public class TVOnCommond implements Commond {

    private TVRecevier tvRecevier;

    public TVOnCommond(TVRecevier tvRecevier){
        this.tvRecevier = tvRecevier;
    }

    @Override
    public void execute() {
        tvRecevier.on();
    }

    @Override
    public void undo() {
        tvRecevier.close();
    }
}
