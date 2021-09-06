package p16_observer_pattern.version1;

/**
 * @author YangYunhe
 * @date 2020-12-31 11:12
 * @description
 */
public class Watch extends Thread {

    private HanFeiZi hanFeiZi;
    private LiSi liSi;
    private String type;

    public Watch(HanFeiZi hanFeiZi, LiSi liSi, String type) {
        this.hanFeiZi = hanFeiZi;
        this.liSi = liSi;
        this.type = type;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 监控是否在吃早饭
            if ("breakfast".equals(type)) {
                // 发现韩非子在吃饭，就通知李斯
                if (hanFeiZi.isHaveBreakfast()) {
                    liSi.update("韩非子在吃早饭");
                    // 重置状态，继续监控
                    hanFeiZi.setHaveBreakfast(false);
                }
            // 监控是否在娱乐
            } else {
                // 发现韩非子在娱乐，就通知李斯
                if (hanFeiZi.isHaveFun()) {
                    liSi.update("韩非子在娱乐");
                    // 重置状态，继续监控
                    hanFeiZi.setHaveFun(false);
                }
            }
        }
    }

}
