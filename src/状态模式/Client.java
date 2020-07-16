package 状态模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/15 12:02
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) throws InterruptedException {

        Hero hero = new Hero();
        hero.startMove();

        hero.setState(Hero.DIZZ_STATE);
        //睡眠，在第一次改变状态又变回普通状态后主线程直接跑完，hero对象中的
        //移动线程就一直执行普通状态的 move 方法了
        Thread.sleep(5000);
        hero.setState(Hero.QUICK_STATE);
        Thread.sleep(5000);
        hero.setState(Hero.SLOW_STATE);
        Thread.sleep(5000);
        hero.setState(Hero.NEW_STATE);
        Thread.sleep(5000);

        hero.stopMove();
    }
}
