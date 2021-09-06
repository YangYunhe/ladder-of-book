package p17_responsibility_chain_pattern.version2;

/**
 * @author YangYunhe
 * @date 2021-01-04 12:37
 * @description
 */
public class Husband extends Handler {

    public Husband() {
        super(2);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("--------妻子向丈夫请示-------");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是: 同意");
    }
}
