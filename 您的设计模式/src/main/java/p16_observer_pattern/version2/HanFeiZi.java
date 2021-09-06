package p16_observer_pattern.version2;

/**
 * @author YangYunhe
 * @date 2020-12-31 11:03
 * @description 被观察者
 */
public class HanFeiZi implements IHanFeiZi {

    private ILiSi liSi = new LiSi();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子: 开始吃饭...");
        liSi.update("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子: 开始娱乐...");
        liSi.update("韩非子在娱乐");
    }

}
