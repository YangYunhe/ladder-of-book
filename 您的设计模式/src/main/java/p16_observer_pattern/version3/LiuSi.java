package p16_observer_pattern.version3;

/**
 * @author YangYunhe
 * @date 2020-12-31 12:46
 * @description 刘斯是齐国的观察者
 */
public class LiuSi implements Observer {

    @Override
    public void update(String context) {
        System.out.println("刘斯: 观察到韩非子活动，向齐王汇报...");
        report(context);
    }

    public void report(String reportContext) {
        System.out.println("刘斯: 报告齐王，韩非子有活动了: " + reportContext);
    }

}
