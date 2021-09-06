package p17_responsibility_chain_pattern.version1;

/**
 * @author YangYunhe
 * @date 2021-01-04 12:37
 * @description
 */
public class Husband implements IHandler {

    /**
     * 妻子向丈夫请示
     */
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("妻子的请示是: " + women.getRequest());
        System.out.println("丈夫的答复是: 同意");
    }
}
