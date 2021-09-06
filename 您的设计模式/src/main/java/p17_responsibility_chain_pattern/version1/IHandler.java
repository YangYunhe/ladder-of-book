package p17_responsibility_chain_pattern.version1;

/**
 * @author YangYunhe
 * @date 2021-01-04 12:35
 * @description 父系社会，那就是男性有至高权利，handler控制权
 */
public interface IHandler {

    /**
     * 一个女性（女儿，妻子或者是母亲）要求逛街，你要处理这个请求
     * @param women 一个女性
     */
    void handleMessage(IWomen women);

}
