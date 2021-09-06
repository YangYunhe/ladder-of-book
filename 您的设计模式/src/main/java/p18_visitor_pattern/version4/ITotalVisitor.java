package p18_visitor_pattern.version4;

/**
 * @author YangYunhe
 * @date 2021-01-04 19:58
 * @description
 */
public interface ITotalVisitor extends IVisitor {

    // 统计所有员工工资总和
    void totalSalary();

}
