package p09_template_method_pattern.version1;

/**
 * @author YangYunhe
 * @date 2021-01-04 15:32
 * @description
 */
public class HummerH2Model extends HummerModel {

    @Override
    public void start() {
        System.out.println("悍马H2发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎轰鸣...");
    }

    @Override
    public void run() {
        start();
        engineBoom();
        alarm();
        stop();
    }

}
