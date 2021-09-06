package p17_responsibility_chain_pattern.version1;

/**
 * @author YangYunhe
 * @date 2021-01-04 12:38
 * @description
 */
public class Son implements IHandler {

    /**
     * 母亲向儿子请示
     */
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("母亲的请示是: " + women.getRequest());
        System.out.println("儿子的答复是: 同意");
    }
}
