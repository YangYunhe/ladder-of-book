package p18_visitor_pattern.version4;

/**
 * @author YangYunhe
 * @date 2021-01-04 17:43
 * @description
 */
public class ShowVisitor implements IShowVisitor {

    private String info = "";

    // 组装基本信息
    private String getBasicInfo(Employee employee) {
        return "姓名: " + employee.getName() + "\t性别: " +
                (employee.getSex() == Employee.FEMALE ? "女" : "男") + "\t薪水: " +
                employee.getSalary() + "\t";
    }

    @Override
    public void report() {
        System.out.println(info);
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.info += getBasicInfo(commonEmployee) + "工作: " + commonEmployee.getJob() + "\t\n";
    }

    @Override
    public void visit(Manager manager) {
        this.info += getBasicInfo(manager) + "业绩: " + manager.getPerformance() + "\t\n";
    }

}
