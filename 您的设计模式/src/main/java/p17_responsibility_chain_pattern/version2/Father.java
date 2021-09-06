package p17_responsibility_chain_pattern.version2;

/**
 * @author YangYunhe
 * @date 2021-01-04 12:36
 * @description
 */
public class Father extends Handler {

    public Father() {
        super(1);
    }

    // 父亲的答复
    @Override
    public void response(IWomen women) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是: 同意");
    }
}
