package p15_composite_pattern.version3;

/**
 * @author YangYunhe
 * @date 2020-12-29 13:23
 * @description 公司人员抽象类
 */
public abstract class Corp {

    // 姓名
    private String name = "";
    // 职位
    private String position = "";
    // 薪水
    private int salary = 0;
    // 父节点
    private Corp parent = null;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        return String.format("名称: %s\t职位: %s\t薪水: %s", this.name, this.position, this.salary);
    }

    // 设置父节点
    protected void setParent(Corp parent) {
        this.parent = parent;
    }

    // 得到父节点
    public Corp getParent() {
        return this.parent;
    }

}
