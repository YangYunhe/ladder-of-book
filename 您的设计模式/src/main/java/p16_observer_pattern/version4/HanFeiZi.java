package p16_observer_pattern.version4;

import java.util.Observable;

/**
 * @author YangYunhe
 * @date 2020-12-31 13:36
 * @description
 */
public class HanFeiZi extends Observable {

    public void haveBreakfast() {
        System.out.println("韩非子: 开始吃饭...");
        // 通知所有观察者
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    public void haveFun() {
        System.out.println("韩非子: 开始娱乐...");
        super.setChanged();
        super.notifyObservers("韩非子在娱乐");
    }

}
