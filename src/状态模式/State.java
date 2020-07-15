package 状态模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/15 11:34
 * @Version: 1.0
 **/
public interface State {

    /**
     * 处理移动状态，由子类来具体处理
     * @param hero
     */
    void move(Hero hero);
}
