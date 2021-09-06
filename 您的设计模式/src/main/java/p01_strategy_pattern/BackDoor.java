package p01_strategy_pattern;

/**
 * @author YangYunhe
 * @date 2020-12-29 17:11
 * @description 第一个策略：找乔国老帮忙，让孙权不能杀刘备
 */
public class BackDoor implements IStrategy {

    @Override
    public void operator() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }

}
