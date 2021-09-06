package p05_factory_method_pattern.version1;

/**
 * @author YangYunhe
 * @date 2020-12-31 14:15
 * @description
 */
public class BlackHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("黑种人会笑");
    }

    @Override
    public void cry() {
        System.out.println("黑种人会哭");
    }

    @Override
    public void talk() {
        System.out.println("黑种人会说话");
    }
}
