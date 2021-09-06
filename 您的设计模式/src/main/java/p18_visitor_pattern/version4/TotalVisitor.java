package p18_visitor_pattern.version4;

/**
 * @author YangYunhe
 * @date 2021-01-04 20:07
 * @description
 */
public class TotalVisitor implements ITotalVisitor {

    // 部门经理的工资系数是5
    private static final int MANAGER_COEFFICIENT = 5;
    // 员工的工资系数是2
    private static final int COMMON_EMPLOYEE_COEFFICIENT = 2;

    // 普通员工的工资总和
    private int commonTotalSalary = 0;
    // 部门经理的工资总和
    private int managerTotalSalary = 0;

    // 计算部门经理的工资总和
    private void calManagerSalary(int salary) {
        this.managerTotalSalary += salary * MANAGER_COEFFICIENT;
    }

    // 计算普通员工的工资总和
    private void calCommonSalary(int salary) {
        this.commonTotalSalary += salary * COMMON_EMPLOYEE_COEFFICIENT;
    }

    @Override
    public void totalSalary() {
        System.out.println("总工资: " + (managerTotalSalary + commonTotalSalary));
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        // 计算普通员工的薪水总和
        calCommonSalary(commonEmployee.getSalary());
    }

    @Override
    public void visit(Manager manager) {
        // 计算部门经理的薪水总和
        calManagerSalary(manager.getSalary());
    }

}
