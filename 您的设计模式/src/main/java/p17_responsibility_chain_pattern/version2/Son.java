package p17_responsibility_chain_pattern.version2;

/**
 * @author YangYunhe
 * @date 2021-01-04 12:38
 * @description
 */
public class Son extends Handler {

    public Son() {
        super(3);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是: 同意");
    }

}
