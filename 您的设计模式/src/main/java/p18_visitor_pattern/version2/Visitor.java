package p18_visitor_pattern.version2;

/**
 * @author YangYunhe
 * @date 2021-01-04 17:43
 * @description
 */
public class Visitor implements IVisitor {

    // 组装基本信息
    private String getBasicInfo(Employee employee) {
        return "姓名: " + employee.getName() + "\t性别: " +
                (employee.getSex() == Employee.FEMALE ? "女" : "男") + "\t薪水: " +
                employee.getSalary() + "\t";
    }

    // 组装部门经理的信息
    private String getManagerInfo(Manager manager) {
        return getBasicInfo(manager) + "业绩: " + manager.getPerformance() + "\t";
    }

    // 组装普通员工的信息
    private String getCommonEmployeeInfo(CommonEmployee commonEmployee) {
        return getBasicInfo(commonEmployee) + "工作: " + commonEmployee.getJob() + "\t";
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(getCommonEmployeeInfo(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(getManagerInfo(manager));
    }

}
