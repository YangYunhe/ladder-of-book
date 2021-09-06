package p16_observer_pattern.version3;

/**
 * @author YangYunhe
 * @date 2020-12-31 12:49
 * @description
 */
public class Client {

    public static void main(String[] args) {

        Observer liSi =  new LiSi();
        Observer wangSi =  new WangSi();
        Observer liuSi =  new LiuSi();

        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liuSi);

        hanFeiZi.haveBreakfast();

    }

}
