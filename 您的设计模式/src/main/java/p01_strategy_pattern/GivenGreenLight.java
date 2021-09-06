package p01_strategy_pattern;

/**
 * @author YangYunhe
 * @date 2020-12-29 17:12
 * @description 第二个策略：求吴国太开个绿灯
 */
public class GivenGreenLight implements IStrategy {

    @Override
    public void operator() {
        System.out.println("求吴国太开个绿灯，放行！");
    }
}
