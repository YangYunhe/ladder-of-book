package p16_observer_pattern.version1;

/**
 * @author YangYunhe
 * @date 2020-12-31 11:19
 * @description
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {

        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();

        // 观察早餐
        Watch watchBreakfast = new Watch(hanFeiZi, liSi, "breakfast");
        watchBreakfast.start();
        // 观察娱乐
        Watch watchFun = new Watch(hanFeiZi, liSi, "fun");
        watchFun.start();

        // 韩非子吃饭
        Thread.sleep(1000);
        hanFeiZi.haveBreakfast();

        // 韩非子娱乐
        Thread.sleep(1000);
        hanFeiZi.haveFun();

    }

}
