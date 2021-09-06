package p15_composite_pattern.version1;

import java.util.ArrayList;

/**
 * @author YangYunhe
 * @date 2020-12-25 17:14
 * @description 树枝节点，就是各个部门经理和组长的角色
 */
public class Branch implements IBranch {

    // 存储子节点的信息
    private ArrayList<Object> subordinateList = new ArrayList<>();
    // 树枝节点的名称
    private String name = "";
    // 树枝节点的职位
    private String position = "";
    // 树枝节点的薪水
    private int salary = 0;

    // 通过构造函数传递树枝节点的参数
    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // 获得自己树枝节点的信息
    @Override
    public String getInfo() {
        return String.format("名称: %s\t职位: %s\t薪水: %s", this.name, this.position, this.salary);
    }

    // 增加一个子树枝节点
    @Override
    public void add(IBranch branch) {
        this.subordinateList.add(branch);
    }

    // 增加一个叶子节点
    @Override
    public void add(ILeaf leaf) {
        this.subordinateList.add(leaf);
    }

    // 获得下级的信息
    @Override
    public ArrayList<Object> getSubordinateInfo() {
        return this.subordinateList;
    }
}
