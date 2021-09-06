package p18_visitor_pattern.version3;

/**
 * @author YangYunhe
 * @date 2021-01-04 17:43
 * @description
 */
public class Visitor implements IVisitor {

    // 部门经理的工资系数是5
    private static final int MANAGER_COEFFICIENT = 5;
    // 员工的工资系数是2
    private static final int COMMON_EMPLOYEE_COEFFICIENT = 2;

    // 普通员工的工资总和
    private int commonTotalSalary = 0;
    // 部门经理的工资总和
    private int managerTotalSalary = 0;

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

    // 计算部门经理的工资总和
    private void calManagerSalary(int salary) {
        this.managerTotalSalary += salary * MANAGER_COEFFICIENT;
    }

    // 计算普通员工的工资总和
    private void calCommonSalary(int salary) {
        this.commonTotalSalary += salary * COMMON_EMPLOYEE_COEFFICIENT;
    }

    @Override
    public int getTotalSalary() {
        return managerTotalSalary + commonTotalSalary;
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(getCommonEmployeeInfo(commonEmployee));
        // 计算普通员工的薪水总和
        calCommonSalary(commonEmployee.getSalary());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(getManagerInfo(manager));
        // 计算部门经理的薪水总和
        calManagerSalary(manager.getSalary());
    }

}
