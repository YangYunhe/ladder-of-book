package p16_observer_pattern.version3;

/**
 * @author YangYunhe
 * @date 2020-12-31 12:46
 * @description 王斯是楚国的观察者
 */
public class WangSi implements Observer {

    @Override
    public void update(String context) {
        System.out.println("王斯: 观察到韩非子活动，向楚王汇报...");
        report(context);
    }

    public void report(String reportContext) {
        System.out.println("王斯: 报告楚王，韩非子有活动了: " + reportContext);
    }

}
