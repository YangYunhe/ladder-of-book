package p19_state_pattern.version3;

/**
 * @author YangYunhe
 * @date 2021-01-05 14:33
 * @description
 */
public abstract class LiftState {

    /**
     * 定义一个环境角色，也就是封装状态的变换引起的功能变化
     */
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 电梯门开启动作
     */
    public abstract void open();

    /**
     * 电梯门关闭动作
     */
    public abstract void close();

    /**
     * 电梯运行动作
     */
    public abstract void run();

    /**
     * 电梯停止动作
     */
    public abstract void stop();

}
