package p19_state_pattern.version2;

/**
 * @author YangYunhe
 * @date 2021-01-05 13:26
 * @description
 */
public class Lift implements ILift {

    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        // 在关门状态和停止状态可以开门，其他状态什么也不做
        switch (state) {
            case CLOSING_STATE:
            case STOPPING_STATE:
                openWithoutLogic();
                setState(OPENING_STATE);
                break;
            case OPENING_STATE:
            case RUNNING_STATE:
                // do nothing
                break;
            default: // do nothing
        }
    }

    @Override
    public void close() {
        // 只有在开门状态可以关门
        switch (state) {
            case OPENING_STATE:
                closeWithoutLogic();
                setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
            case STOPPING_STATE:
            case RUNNING_STATE:
                // do nothing
                break;
            default: // do nothing
        }
    }

    @Override
    public void run() {
        // 只有在关闭状态和停止状态可以运行
        switch (state) {
            case CLOSING_STATE:
            case STOPPING_STATE:
                runWithoutLogic();
                setState(RUNNING_STATE);
                break;
            case OPENING_STATE:
            case RUNNING_STATE:
                // do nothing
                break;
            default: // do nothing
        }
    }

    @Override
    public void stop() {
        // 只有在关闭状态和运行状态可以停止
        switch (state) {
            case CLOSING_STATE:
            case RUNNING_STATE:
                stopWithoutLogic();
                setState(STOPPING_STATE);
                break;
            case OPENING_STATE:
            case STOPPING_STATE:
                // do nothing
                break;
            default: // do nothing
        }
    }

    /**
     * 单纯的打开门，不考虑其他条件
     */
    private void openWithoutLogic() {
        System.out.println("电梯门打开...");
    }

    /**
     * 单纯的关闭门，不考虑其他条件
     */
    private void closeWithoutLogic() {
        System.out.println("电梯门关闭...");
    }

    /**
     * 单纯的运行，不考虑其他条件
     */
    private void runWithoutLogic() {
        System.out.println("电梯上升或下降...");
    }

    /**
     * 单纯的停止，不考虑其他条件
     */
    private void stopWithoutLogic() {
        System.out.println("电梯停在某层...");
    }

}
