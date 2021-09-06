package p09_template_method_pattern.version2;

/**
 * @author YangYunhe
 * @date 2021-01-04 15:37
 * @description
 */
public class Client {

    public static void main(String[] args) {

        HummerModel h1 = new HummerH1Model();
        h1.run();
        HummerModel h2 = new HummerH2Model();
        h2.run();

    }

}
