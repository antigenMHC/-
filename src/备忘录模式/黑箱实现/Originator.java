package 备忘录模式.黑箱实现;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/14 11:08
 * @Version: 1.0
 **/

/**
 * 原发器
 */
public class Originator {
    private int buffState;

    public int getBuffState() {
        return buffState;
    }

    public void setBuffState(int buffState) {
        this.buffState = buffState;
    }

    /**
     * 保存原发器状态到备忘录对象，并返回备忘录对象以便备忘录管理者管理
     * @return
     */
    public IMemento saveMemento(){
        return new Memento(buffState);
    }

    /**
     * 恢复状态, 根据传入的备忘录对象的状态信息来赋值恢复
     * @param memento
     */
    public void getOldState(IMemento memento){
        this.buffState = ((Memento)memento).getBuffState();
    }

    /**
     * 私有内部类实现备忘录
     */
    private class Memento implements IMemento{

        private int buffState;

        private Memento(int buffState){
            this.buffState = buffState;
        }

        public int getBuffState() {
            return buffState;
        }

    }
}
