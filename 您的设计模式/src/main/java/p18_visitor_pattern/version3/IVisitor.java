package p18_visitor_pattern.version3;

/**
 * @author YangYunhe
 * @date 2021-01-04 17:40
 * @description
 */
public interface IVisitor {

    // 定义可以访问普通员工
    void visit(CommonEmployee commonEmployee);

    // 定义可以访问部门经理
    void visit(Manager manager);

    // 统计所有员工工资总和
    int getTotalSalary();

}
