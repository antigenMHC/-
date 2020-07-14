package 备忘录模式.黑箱实现;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/14 11:14
 * @Version: 1.0
 **/
public class Caretaker {

    private List<IMemento> mementos;

    public Caretaker(){
        mementos = new ArrayList<>();
    }

    public void addMemento(IMemento memento){
        mementos.add(memento);
    }

    public void deleMemento(IMemento memento){
        mementos.remove(memento);
    }

    public IMemento getMemento(int index){
        return mementos.get(index);
    }
}
