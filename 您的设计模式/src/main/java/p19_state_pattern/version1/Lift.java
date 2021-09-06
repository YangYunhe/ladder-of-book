package p19_state_pattern.version1;

/**
 * @author YangYunhe
 * @date 2021-01-05 13:26
 * @description
 */
public class Lift implements ILift {

    @Override
    public void open() {
        System.out.println("电梯门打开...");
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭...");
    }

    @Override
    public void run() {
        System.out.println("电梯上升或下降...");
    }

    @Override
    public void stop() {
        System.out.println("电梯停在某层...");
    }
}
