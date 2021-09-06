package p19_state_pattern.version1;

/**
 * @author YangYunhe
 * @date 2021-01-05 13:27
 * @description
 */
public class Client {

    public static void main(String[] args) {

        ILift lift = new Lift();
        lift.open();
        lift.close();
        lift.run();
        lift.stop();

    }

}
