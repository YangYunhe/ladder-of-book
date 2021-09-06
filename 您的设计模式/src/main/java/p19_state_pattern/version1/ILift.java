package p19_state_pattern.version1;

/**
 * @author YangYunhe
 * @date 2021-01-05 13:23
 * @description 定义一个电梯的接口
 */
public interface ILift {

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
