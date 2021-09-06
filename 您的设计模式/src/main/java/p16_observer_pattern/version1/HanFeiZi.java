package p16_observer_pattern.version1;

/**
 * @author YangYunhe
 * @date 2020-12-31 11:03
 * @description 被观察者
 */
public class HanFeiZi implements IHanFeiZi {

    // 韩非子是否在吃饭
    private boolean isHaveBreakfast = false;
    // 韩非子是否在娱乐
    private boolean isHaveFun = false;

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子: 开始吃饭...");
        isHaveBreakfast = true;
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子: 开始娱乐...");
        isHaveFun = true;
    }

    public boolean isHaveBreakfast() {
        return this.isHaveBreakfast;
    }

    public boolean isHaveFun() {
        return this.isHaveFun;
    }

    public void setHaveBreakfast(boolean haveBreakfast) {
        isHaveBreakfast = haveBreakfast;
    }

    public void setHaveFun(boolean haveFun) {
        isHaveFun = haveFun;
    }
}
