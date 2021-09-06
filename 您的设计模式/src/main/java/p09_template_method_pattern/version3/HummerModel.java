package p09_template_method_pattern.version3;

/**
 * @author YangYunhe
 * @date 2021-01-04 15:28
 * @description
 */
public abstract class HummerModel {

    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    protected boolean isAlarm() {
        return true;
    }

    final public void run() {
        start();
        engineBoom();
        if (isAlarm()) {
            alarm();
        }
        stop();
    }

}
