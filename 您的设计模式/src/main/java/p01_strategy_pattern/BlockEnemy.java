package p01_strategy_pattern;

/**
 * @author YangYunhe
 * @date 2020-12-29 17:13
 * @description 第三个策略：孙夫人断后，挡住追兵
 */
public class BlockEnemy implements IStrategy {

    @Override
    public void operator() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
