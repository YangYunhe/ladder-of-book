package p17_responsibility_chain_pattern.version1;

/**
 * @author YangYunhe
 * @date 2021-01-04 12:36
 * @description
 */
public class Father implements IHandler {

    /**
     * 未出嫁女儿来请示父亲
     */
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("女儿的请示是: " + women.getRequest());
        System.out.println("父亲的答复是: 同意");
    }
}
