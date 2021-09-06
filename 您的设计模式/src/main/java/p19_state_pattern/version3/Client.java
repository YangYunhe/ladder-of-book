package p19_state_pattern.version3;

/**
 * @author YangYunhe
 * @date 2021-01-05 15:03
 * @description
 */
public class Client {

    public static void main(String[] args) {

        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();

    }

}
