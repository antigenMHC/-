package 状态模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/15 11:42
 * @Version: 1.0
 **/
public class DizzState implements State {

    @Override
    public void move(Hero hero) {
        System.out.println("英雄被眩晕");

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //恢复正常状态
        hero.setState(Hero.NORMAL_STATE);
        System.out.println("眩晕状态结束，英雄恢复正常状态");
    }
}
