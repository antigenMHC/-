package 状态模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/15 11:42
 * @Version: 1.0
 **/
public class Hero {
    /**
     * 正常状态
     */
    public static final State NORMAL_STATE = new NormalState();

    /**
     * 减速状态
     */
    public static final State SLOW_STATE = new SlowState();

    /**
     * 加速状态
     */
    public static final State QUICK_STATE = new QuickState();

    /**
     * 眩晕状态
     */
    public static final State DIZZ_STATE = new DizzState();

    //表示英雄当前状态
    private State state = NORMAL_STATE;

    //英雄移动线程，便于观察状态变化时的行为变化
    private Thread moveThread;

    /**
     * 设置状态
     * @param state：新状态
     */
    public void setState(State state){
        this.state = state;
    }

    /**
     * 判断是否在移动
     */
    public boolean isMoving(){
        return moveThread != null && !moveThread.isInterrupted();
    }

    /**
     * 开始移动
     */
    public void startMove(){
        if(isMoving()){
            return;
        }
        final Hero hero = this;
        moveThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(!moveThread.isInterrupted()){
                    state.move(hero);
                }
            }
        });
        System.out.println("英雄开始移动");
        moveThread.start();
    }

    public void stopMove(){
        if(isMoving()){
            moveThread.interrupt();
        }
        System.out.println("英雄停止移动");
    }
}
