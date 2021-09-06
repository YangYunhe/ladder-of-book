package p15_composite_pattern.version2;

import java.util.ArrayList;

/**
 * @author YangYunhe
 * @date 2020-12-28 10:20
 * @description 组装树形结构
 */
public class Client {

    public static void main(String[] args) {

        // 组装一个组织结构
        Branch ceo = compositeCorpTree();

        // 打印CEO的信息
        System.out.println(ceo.getInfo());

        // 打印所有员工的信息
        System.out.println(getTreeInfo(ceo));

    }

    // 遍历整棵树，只要给我根节点，我就能遍历出所有的节点
    public static String getTreeInfo(Branch root) {
        StringBuilder info = new StringBuilder();
        ArrayList<ICorp> subordinateList = root.getSubordinateInfo();
        for (ICorp iCorp : subordinateList) {
            if(iCorp instanceof Leaf) {
                info.append(iCorp.getInfo()).append("\n");
            } else {
                info.append(iCorp.getInfo()).append("\n").append(getTreeInfo((Branch)iCorp));
            }
        }
        return info.toString();
    }

    public static Branch compositeCorpTree() {
        // 首先产生了CEO
        Branch ceo = new Branch("王大麻子", "CEO", 100000);
        // 产生三个部门经理
        Branch developDep = new Branch("刘大瘸子", "研发部经理", 10000);
        Branch salesDep = new Branch("马儿拐子", "销售部经理", 20000);
        Branch financeDep = new Branch("赵三驼子", "财务部经理", 30000);
        // 再把三个小组长产生出来
        Branch firstDevGroup = new Branch("杨三乜斜", "开发一组组长", 5000);
        Branch secondDevGroup = new Branch("吴大棒槌", "开发二组组长", 6000);
        // 把所有的小兵都创建出来
        Leaf zhengLaoLiu = new Leaf("郑老六", "研发部副总", 20000);
        Leaf a = new Leaf("A", "开发人员", 2000);
        Leaf b = new Leaf("B", "开发人员", 2000);
        Leaf c = new Leaf("C", "开发人员", 2000);
        Leaf d = new Leaf("D", "开发人员", 2000);
        Leaf e = new Leaf("E", "开发人员", 2000);
        Leaf f = new Leaf("F", "开发人员", 2000);
        Leaf g = new Leaf("G", "开发人员", 2000);
        Leaf h = new Leaf("H", "销售人员", 5000);
        Leaf i = new Leaf("I", "销售人员", 4000);
        Leaf j = new Leaf("J", "财务人员", 5000);
        Leaf k = new Leaf("K", "CEO秘书", 8000);

        // 组装这棵树
        // 定义CEO下的三个部门经理和一个秘书
        ceo.addSubordinate(developDep);
        ceo.addSubordinate(salesDep);
        ceo.addSubordinate(financeDep);
        // 总经理下还有一个秘书
        ceo.addSubordinate(k);

        // 定义研发部门下的结构
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);
        developDep.addSubordinate(zhengLaoLiu);

        // 定义两个开发小组下的结构
        firstDevGroup.addSubordinate(a);
        firstDevGroup.addSubordinate(b);
        firstDevGroup.addSubordinate(c);
        secondDevGroup.addSubordinate(d);
        secondDevGroup.addSubordinate(e);
        secondDevGroup.addSubordinate(f);

        // 定义销售部下的人员
        salesDep.addSubordinate(h);
        salesDep.addSubordinate(i);
        // 定义财务部下的人员
        financeDep.addSubordinate(j);

        return ceo;
    }

}
