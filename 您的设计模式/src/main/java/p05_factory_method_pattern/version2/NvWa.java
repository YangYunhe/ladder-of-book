package p05_factory_method_pattern.version2;

/**
 * @author YangYunhe
 * @date 2020-12-31 14:20
 * @description
 */
public class NvWa {

    public static void main(String[] args) {

        System.out.println("随机创造人种...");
        for (int i = 0; i < 1000; i++) {
            Human human = HumanFactory.createHuman();
            human.laugh();
            human.cry();
            human.talk();
        }

    }

}
