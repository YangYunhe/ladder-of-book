package p19_state_pattern.version2;

/**
 * @author YangYunhe
 * @date 2021-01-05 13:23
 * @description 定义一个电梯的接口
 */
public interface ILift {

    /**
     * 门敞状态
     */
    int OPENING_STATE = 1;

    /**
     * 门闭状态
     */
    int CLOSING_STATE = 2;

    /**
     * 运行状态
     */
    int RUNNING_STATE = 3;

    /**
     * 设置电梯的状态
     * @param state 电梯状态
     */
    void setState(int state);

    /**
     * 停止状态
     */
    int STOPPING_STATE = 4;

    /**
     * 电梯门开启动作
     */
    void open();

    /**
     * 电梯门关闭动作
     */
    void close();

    /**
     * 电梯上升或下降
     */
    void run();

    /**
     * 电梯停在某层
     */
    void stop();

}
