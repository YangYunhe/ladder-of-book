package p15_composite_pattern.version1;

import java.util.ArrayList;

/**
 * @author YangYunhe
 * @date 2020-12-25 17:02
 * @description 根节点的实现类
 */
public class Root implements IRoot {

    // 保存根节点下的树枝节点和树叶节点，subordinate是下级的意思
    private ArrayList<Object> subordinateList = new ArrayList<>();
    // 根节点的名称
    private String name = "";
    // 根节点的职位
    private String position = "";
    // 根节点的薪水
    private int salary = 0;

    // 通过构造函数传递进来总经理的信息
    public Root(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // 得到自己的信息
    @Override
    public String getInfo() {
        return String.format("名称: %s\t职位: %s\t薪水: %s", this.name, this.position, this.salary);
    }

    // 增加树枝节点
    @Override
    public void add(IBranch branch) {
        this.subordinateList.add(branch);
    }

    // 增加叶子节点，比如秘书，直接隶属于总经理
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
