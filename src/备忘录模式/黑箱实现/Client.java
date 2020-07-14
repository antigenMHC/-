package 备忘录模式.黑箱实现;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/14 11:17
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        System.out.println("当前英雄状态，有"+originator.getBuffState()+"个debuff");

        //保存状态，并交给备忘录管理者管理
        caretaker.addMemento(originator.saveMemento());
        //修改状态
        originator.setBuffState(8);
        System.out.println("当前英雄状态，有"+originator.getBuffState()+"个debuff");

        System.out.println("发动英雄技能：时间的主人");
        //恢复状态
        originator.getOldState(caretaker.getMemento(0));
        System.out.println("当前英雄状态，有"+originator.getBuffState()+"个debuff");

    }
}
