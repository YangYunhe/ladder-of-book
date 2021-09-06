package p16_observer_pattern.version2;

/**
 * @author YangYunhe
 * @date 2020-12-31 11:08
 * @description 观察者
 */
public class LiSi implements ILiSi {

    // 首先李斯是个观察者，一旦韩非子有活动，他就要向老板汇报
    @Override
    public void update(String context) {
        System.out.println("李斯: 观察到韩非子活动，向秦始皇汇报...");
        report(context);
    }

    public void report(String reportContext) {
        System.out.println("李斯: 报告，韩非子有活动了: " + reportContext);
    }
}
