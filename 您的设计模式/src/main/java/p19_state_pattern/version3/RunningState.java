package p19_state_pattern.version3;

/**
 * @author YangYunhe
 * @date 2021-01-05 14:45
 * @description
 */
public class RunningState extends LiftState {

    @Override
    public void open() {
        // do nothing
    }

    @Override
    public void close() {
        // do nothing
    }

    @Override
    public void run() {
        System.out.println("电梯上下跑...");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }
}
