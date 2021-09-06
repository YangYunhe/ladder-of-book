package p15_composite_pattern.version2;

import java.util.ArrayList;

/**
 * @author YangYunhe
 * @date 2020-12-25 17:14
 * @description 树枝节点，就是各个部门经理和组长的角色
 */
public class Branch implements IBranch, ICorp {

    // 下级
    private ArrayList<ICorp> subordinateList = new ArrayList<>();
    // 姓名
    private String name = "";
    // 职位
    private String position = "";
    // 薪水
    private int salary = 0;

    // 通过构造函数传递树枝节点的参数
    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // 增加一个下属，可能是小头目，也可能是个小兵
    @Override
    public void addSubordinate(ICorp corp) {
        this.subordinateList.add(corp);
    }

    @Override
    public ArrayList<ICorp> getSubordinateInfo() {
        return this.subordinateList;
    }

    // 获取自己的信息
    @Override
    public String getInfo() {
        return String.format("名称: %s\t职位: %s\t薪水: %s", this.name, this.position, this.salary);
    }
}
