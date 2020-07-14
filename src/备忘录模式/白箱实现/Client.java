package 备忘录模式.白箱实现;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/14 10:31
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        System.out.println("当前英雄状态，有"+originator.getBuffState()+"个debuff");

        //保存通过原发器状态信息创建的对应备忘录对象到备忘录管理对象中
        caretaker.addMemento(originator.saveStateMemento());

        //修改状态信息
        originator.setBuffState(4);
        System.out.println("当前英雄状态，有"+originator.getBuffState()+"个debuff");

        System.out.println("发动技能：时间管理");
        //恢复到上一次的状态。
        //如果在备忘录管理对象的集合中存在多个备忘录对象，则通过下标来选择需要恢复的状态
        originator.getOldState(caretaker.getMemento(caretaker.getSize()-1));
        System.out.println("当前英雄状态，有"+originator.getBuffState()+"个debuff");
    }
}
