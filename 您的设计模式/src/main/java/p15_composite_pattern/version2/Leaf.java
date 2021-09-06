package p15_composite_pattern.version2;

/**
 * @author YangYunhe
 * @date 2020-12-25 18:25
 * @description
 */
public class Leaf implements ICorp {

    // 小兵的名字
    private String name = "";
    // 小兵的职位
    private String position = "";
    // 小兵的薪水
    private int salary = 0;

    // 通过构造函数传递信息
    public Leaf(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // 获得小兵的信息
    @Override
    public String getInfo() {
        return String.format("名称: %s\t职位: %s\t薪水: %s", this.name, this.position, this.salary);
    }
}
