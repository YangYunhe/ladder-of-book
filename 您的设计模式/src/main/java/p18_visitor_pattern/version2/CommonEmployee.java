package p18_visitor_pattern.version2;

/**
 * @author YangYunhe
 * @date 2021-01-04 16:40
 * @description 普通员工，也就是最小的小兵
 */
public class CommonEmployee extends Employee {

    // 工作内容
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
