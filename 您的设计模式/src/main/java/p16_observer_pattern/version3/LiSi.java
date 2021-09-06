package p16_observer_pattern.version3;

/**
 * @author YangYunhe
 * @date 2020-12-31 12:29
 * @description 李斯是秦国的观察者
 */
public class LiSi implements Observer {

    @Override
    public void update(String context) {
        System.out.println("李斯: 观察到韩非子活动，向秦王汇报...");
        report(context);
    }

    public void report(String reportContext) {
        System.out.println("李斯: 报告秦王，韩非子有活动了: " + reportContext);
    }

}
