package p18_visitor_pattern.version3;

/**
 * @author YangYunhe
 * @date 2021-01-04 16:34
 * @description 在一个单位里谁都是员工，甭管你是部门经理还是小兵
 */
public abstract class Employee {

    // 0代表男性
    public static final int MALE = 0;
    // 1代表女性
    public static final int FEMALE = 1;

    private String name;
    private int salary;
    private int sex;

    // 一个访问者过来访问
    public abstract void accept(IVisitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
