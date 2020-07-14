package 备忘录模式.白箱实现;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/14 10:27
 * @Version: 1.0
 **/
public class Caretaker {

    private List<Memento> mementos;

    public Caretaker(){
        mementos = new ArrayList<>();
    }

    public void addMemento(Memento memento){
        mementos.add(memento);
    }

    public void deleMemento(Memento memento){
        mementos.remove(memento);
    }

    //获取第 index 个 Originator 对象被保存的状态
    public Memento getMemento(int index){
        return mementos.get(index);
    }

    public int getSize(){
        return mementos.size();
    }
}
