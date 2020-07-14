package 备忘录模式.白箱实现;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/14 10:16
 * @Version: 1.0
 **/
public class Memento {

    private int buffState;

    public Memento(int buffState){
        this.buffState = buffState;
    }

    public int getBuffState() {
        return buffState;
    }
}
