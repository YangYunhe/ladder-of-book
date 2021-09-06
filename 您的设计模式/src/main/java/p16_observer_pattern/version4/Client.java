package p16_observer_pattern.version4;

import java.util.Observer;

/**
 * @author YangYunhe
 * @date 2020-12-31 13:40
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
