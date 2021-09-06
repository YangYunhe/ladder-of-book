package p15_composite_pattern.version3;

import java.util.ArrayList;

/**
 * @author YangYunhe
 * @date 2020-12-29 13:27
 * @description 节点类，也简单了很多
 */
public class Branch extends Corp {

    // 领导下边有那些下级领导和小兵
    private ArrayList<Corp> subordinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    // 增加一个下属，可能是小头目，也可能是个小兵
    public void addSubordinate(Corp corp) {
        corp.setParent(this);
        this.subordinateList.add(corp);
    }

    // 我有哪些下属
    public ArrayList<Corp> getSubordinateInfo() {
        return this.subordinateList;
    }

}
