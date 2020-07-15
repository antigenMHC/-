package 状态模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/15 11:35
 * @Version: 1.0
 **/
public class SlowState implements State {
    /**
     *
     * @param hero
     */
    @Override
    public void move(Hero hero) {
        System.out.println("英雄被减速");

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //恢复正常状态
        hero.setState(Hero.NORMAL_STATE);
        System.out.println("减速状态结束，英雄恢复正常状态");
    }
}
