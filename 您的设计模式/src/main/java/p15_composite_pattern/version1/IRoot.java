package p15_composite_pattern.version1;

import java.util.ArrayList;

/**
 * @author YangYunhe
 * @date 2020-12-25 16:56
 * @description 定义一个根节点，就为总经理服务
 */
public interface IRoot {

    // 得到总经理的信息
    String getInfo();

    // 总经理下边要有小兵，那要能增加小兵，比如研发部经理，这是个树枝节点
    void add(IBranch branch);

    // 增加树叶节点
    void add(ILeaf leaf);

    // 遍历下属
    ArrayList<Object> getSubordinateInfo();

}
