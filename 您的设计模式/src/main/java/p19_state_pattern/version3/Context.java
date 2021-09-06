package p19_state_pattern.version3;

/**
 * @author YangYunhe
 * @date 2021-01-05 14:34
 * @description
 */
public class Context {

    /**
     * 定义出所有的电梯状态
     */
    public static final OpeningState OPENING_STATE = new OpeningState();
    public static final ClosingState CLOSING_STATE = new ClosingState();
    public static final RunningState RUNNING_STATE = new RunningState();
    public static final StoppingState STOPPING_STATE = new StoppingState();

    /**
     * 定义一个当前电梯状态
     */
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        // 把当前环境通知到各个实现类中
        this.liftState.setContext(this);
    }

    public void open() {
        liftState.open();
    }

    public void close() {
        liftState.close();
    }

    public void run() {
        liftState.run();
    }

    public void stop() {
        liftState.stop();
    }

}
