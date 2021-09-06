package p17_responsibility_chain_pattern.version2;

/**
 * @author YangYunhe
 * @date 2021-01-04 12:32
 * @description
 */
public class Women implements IWomen {

    /**
     * 1: 未婚
     * 2: 已婚
     * 3: 丧偶
     */
    private int type = 0;

    /**
     * 妇女的请示
     */
    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        switch (this.type) {
            case 1:
                this.request = "女儿的请求是: " + request;
                break;
            case 2:
                this.request = "妻子的请求是: " + request;
                break;
            case 3:
                this.request = "母亲的请求是: " + request;
                break;
            default: // do nothing
        }
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public String getRequest() {
        return request;
    }
}
