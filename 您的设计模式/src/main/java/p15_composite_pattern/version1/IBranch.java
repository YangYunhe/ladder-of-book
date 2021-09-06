package p15_composite_pattern.version1;

import java.util.ArrayList;

/**
 * @author YangYunhe
 * @date 2020-12-25 16:59
 * @description 树枝节点，也就是各个部门经理和组长的角色
 */
public interface IBranch {

    // 获取信息
    String getInfo();

    // 增加数据节点，例如研发部下的研发一组
    void add(IBranch branch);

    // 增加树叶节点
    void add(ILeaf leaf);

    // 获取下级信息
    ArrayList<Object> getSubordinateInfo();

}
