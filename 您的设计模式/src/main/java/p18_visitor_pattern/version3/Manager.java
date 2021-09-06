package p18_visitor_pattern.version3;

/**
 * @author YangYunhe
 * @date 2021-01-04 16:41
 * @description 经理级人物
 */
public class Manager extends Employee {

    // 业绩
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
