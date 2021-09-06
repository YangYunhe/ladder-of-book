package p15_composite_pattern.version1;

import java.util.ArrayList;

/**
 * @author YangYunhe
 * @date 2020-12-25 17:23
 * @description Client的作用是组装这棵树，并遍历一遍
 */
public class Client {

    public static void main(String[] args) {

        // 首先产生了一个根节点
        IRoot ceo = new Root("王大麻子", "CEO", 100000);

        // 产生三个部门经理，也就是树枝节点
        IBranch developDep = new Branch("刘大瘸子", "研发部经理", 10000);
        IBranch salesDep = new Branch("马儿拐子", "销售部经理", 20000);
        IBranch financeDep = new Branch("赵三驼子", "财务部经理", 30000);

        // 再把三个小组长产生出来
        IBranch firstDevGroup = new Branch("杨三乜斜", "开发一组组长", 5000);
        IBranch secondDevGroup = new Branch("吴大棒槌", "开发二组组长", 6000);

        // 剩下的就是我们这些小兵了,就是路人甲，路人乙
        ILeaf zhengLaoLiu = new Leaf("郑老六", "研发部副总", 20000);
        ILeaf a = new Leaf("A", "开发人员", 2000);
        ILeaf b = new Leaf("B", "开发人员", 2000);
        ILeaf c = new Leaf("C", "开发人员", 2000);
        ILeaf d = new Leaf("D", "开发人员", 2000);
        ILeaf e = new Leaf("E", "开发人员", 2000);
        ILeaf f = new Leaf("F", "开发人员", 2000);
        ILeaf g = new Leaf("G", "开发人员", 2000);
        ILeaf h = new Leaf("H", "销售人员", 5000);
        ILeaf i = new Leaf("I", "销售人员", 4000);
        ILeaf j = new Leaf("J", "财务人员", 5000);
        ILeaf k = new Leaf("K", "CEO秘书", 8000);

        // 组装这棵树
        // 首先是定义总经理下有三个部门经理
        ceo.add(developDep);
        ceo.add(salesDep);
        ceo.add(financeDep);
        // 总经理下还有一个秘书
        ceo.add(k);

        // 定义研发部门下的结构
        developDep.add(firstDevGroup);
        developDep.add(secondDevGroup);
        // 研发部经理下还有一个副总
        developDep.add(zhengLaoLiu);

        // 看看开发两个开发小组下有什么
        firstDevGroup.add(a);
        firstDevGroup.add(b);
        firstDevGroup.add(c);
        secondDevGroup.add(d);
        secondDevGroup.add(e);
        secondDevGroup.add(f);

        // 再看销售部下的人员情况
        salesDep.add(h);
        salesDep.add(i);
        // 最后一个财务
        financeDep.add(j);

        // 树状结构写完毕，然后我们打印出来
        System.out.println(ceo.getInfo());

        //打印出来整个树形
        getAllSubordinateInfo(ceo.getSubordinateInfo());

    }

    // 遍历所有的树枝节点，打印出信息
    private static void getAllSubordinateInfo(ArrayList<Object> subordinateList) {
        for (Object obj : subordinateList) {
            if (obj instanceof Leaf) {
                ILeaf leaf = (ILeaf)obj;
                System.out.println(leaf.getInfo());
            } else {
                IBranch branch = (IBranch)obj;
                System.out.println(branch.getInfo());
                getAllSubordinateInfo(branch.getSubordinateInfo());
            }
        }
    }

}
