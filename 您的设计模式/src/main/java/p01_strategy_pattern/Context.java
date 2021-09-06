package p01_strategy_pattern;

/**
 * @author YangYunhe
 * @date 2020-12-29 17:14
 * @description 计谋有了，那还要有锦囊来存放三个计谋
 */
public class Context {

    private IStrategy strategy;

    // 构造函数，你要使用哪个妙计
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    // 使用计谋，看我出招了
    public void operator() {
        strategy.operator();
    }

}
