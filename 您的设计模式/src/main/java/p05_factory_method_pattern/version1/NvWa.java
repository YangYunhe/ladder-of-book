package p05_factory_method_pattern.version1;

/**
 * @author YangYunhe
 * @date 2020-12-31 14:20
 * @description
 */
public class NvWa {

    public static void main(String[] args) {

        System.out.println("创造白种人...");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.laugh();
        whiteHuman.cry();
        whiteHuman.talk();

        System.out.println("创造黑种人...");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.laugh();
        blackHuman.cry();
        blackHuman.talk();

        System.out.println("创造黄种人...");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.laugh();
        yellowHuman.cry();
        yellowHuman.talk();

    }

}
