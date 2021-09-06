package p17_responsibility_chain_pattern.version2;

/**
 * @author YangYunhe
 * @date 2021-01-04 12:35
 * @description 父系社会，那就是男性有至高权利，handler控制权
 */
public abstract class Handler {

    // 能处理的级别
    private int level = 0;

    // 责任传递，下一个人责任人是谁
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    public abstract void response(IWomen women);

    public final void handleMessage(IWomen women) {
        if (women.getType() == level) {
            response(women);
        } else {
            if (nextHandler != null) {
                nextHandler.handleMessage(women);
            } else {
                System.out.println("----------没有地方请示了，不做处理----------");
            }
        }
    }

}
