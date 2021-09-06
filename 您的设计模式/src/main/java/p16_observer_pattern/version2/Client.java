package p16_observer_pattern.version2;

/**
 * @author YangYunhe
 * @date 2020-12-31 11:19
 * @description
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {

        HanFeiZi hanFeiZi = new HanFeiZi();

        // 韩非子吃饭
        hanFeiZi.haveBreakfast();

        // 韩非子娱乐
        hanFeiZi.haveFun();

    }

}
