package p16_observer_pattern.version3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YangYunhe
 * @date 2020-12-31 12:25
 * @description
 */
public class HanFeiZi implements Observable {

    // 所有的观察者
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer : observerList) {
            observer.update(context);
        }
    }

    public void haveBreakfast() {
        System.out.println("韩非子: 开始吃饭...");
        notifyObservers("韩非子在吃饭");
    }

    public void haveFun() {
        System.out.println("韩非子: 开始娱乐...");
        notifyObservers("韩非子在娱乐");
    }

}
