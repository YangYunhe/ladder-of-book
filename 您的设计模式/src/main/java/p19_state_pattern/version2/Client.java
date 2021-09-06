package p19_state_pattern.version2;

/**
 * @author YangYunhe
 * @date 2021-01-05 13:27
 * @description
 */
public class Client {

    public static void main(String[] args) {

        ILift lift = new Lift();
        // 电梯的初始状态为停止状态
        lift.setState(ILift.STOPPING_STATE);
        lift.open();
        lift.close();
        lift.run();
        lift.stop();

    }

}
