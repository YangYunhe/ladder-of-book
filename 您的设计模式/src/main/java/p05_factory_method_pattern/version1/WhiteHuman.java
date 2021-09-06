package p05_factory_method_pattern.version1;

/**
 * @author YangYunhe
 * @date 2020-12-31 14:16
 * @description
 */
public class WhiteHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("白种人会笑");
    }

    @Override
    public void cry() {
        System.out.println("白种人会哭");
    }

    @Override
    public void talk() {
        System.out.println("白种人会说话");
    }
}
