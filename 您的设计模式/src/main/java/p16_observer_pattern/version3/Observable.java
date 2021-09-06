package p16_observer_pattern.version3;

/**
 * @author YangYunhe
 * @date 2020-12-31 12:15
 * @description 所有被观察者的通用接口
 */
public interface Observable {

    // 增加观察者
    void addObserver(Observer observer);

    // 删除观察者
    void deleteObserver(Observer observer);

    // 通知所有观察者
    void notifyObservers(String context);

}
