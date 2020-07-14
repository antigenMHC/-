package 备忘录模式.白箱实现;

import javax.swing.*;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/14 10:15
 * @Version: 1.0
 **/
public class Originator {

    //状态信息
    private int buffState;

    public int getBuffState() {
        return buffState;
    }

    public void setBuffState(int buffState) {
        this.buffState = buffState;
    }

    /**
     * 保存当前状态信息，并返回备忘录对象
     * 返回对象用于加入备忘录管理对象中
     * @return
     */
    public Memento saveStateMemento(){
        return new Memento(buffState);
    }

    /**
     * 获得原来的状态信息，并更新当前对象状态信息
     * @param memento：状态信息
     */
    public void getOldState(Memento memento){
        this.buffState = memento.getBuffState();
    }
}
