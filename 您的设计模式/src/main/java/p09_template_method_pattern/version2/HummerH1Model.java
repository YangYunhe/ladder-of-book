package p09_template_method_pattern.version2;

/**
 * @author YangYunhe
 * @date 2021-01-04 15:29
 * @description
 */
public class HummerH1Model extends HummerModel {

    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎轰鸣...");
    }

}
