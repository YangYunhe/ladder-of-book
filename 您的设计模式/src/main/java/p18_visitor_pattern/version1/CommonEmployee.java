package p18_visitor_pattern.version1;

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
    protected String getOtherInfo() {
        return "工作: " +job + "\t";
    }
}
