package p15_composite_pattern.version2;

import java.util.ArrayList;

/**
 * @author YangYunhe
 * @date 2020-12-25 16:59
 * @description 树枝节点，有下属节点
 */
public interface IBranch {

    // 能够增加小兵(树叶节点）或者是经理（树枝节点）
    void addSubordinate(ICorp corp);

    // 获取下级信息
    ArrayList<ICorp> getSubordinateInfo();

}
