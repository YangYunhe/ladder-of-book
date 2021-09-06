package p19_state_pattern.version3;

/**
 * @author YangYunhe
 * @date 2021-01-05 14:41
 * @description 在电梯门开启的状态下能做什么事情
 */
public class OpeningState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void close() {
        // 修改状态
        super.context.setLiftState(Context.CLOSING_STATE);
        // 动作委托CLOSING_STATE来执行
        super.context.getLiftState().close();
    }

    /**
     * 打开状态不能运行
     */
    @Override
    public void run() {
        // do nothing
    }

    /**
     * 打开状态是停止状态
     */
    @Override
    public void stop() {
        // do nothing
    }
}
