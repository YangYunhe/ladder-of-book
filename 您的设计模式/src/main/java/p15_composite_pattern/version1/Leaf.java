package p15_composite_pattern.version1;

/**
 * @author YangYunhe
 * @date 2020-12-25 17:17
 * @description 最小的叶子节点
 */
public class Leaf implements ILeaf {

    // 叶子叫什么名字
    private String name = "";
    // 叶子的职位
    private String position = "";
    // 叶子的薪水
    private int salary = 0;

    // 通过构造函数传递信息
    public Leaf(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // 最小的小兵只能获得自己的信息了
    @Override
    public String getInfo() {
        return String.format("名称: %s\t职位: %s\t薪水: %s", this.name, this.position, this.salary);
    }
}
