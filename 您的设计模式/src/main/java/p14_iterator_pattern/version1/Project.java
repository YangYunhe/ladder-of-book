package p14_iterator_pattern.version1;

/**
 * @author YangYunhe
 * @date 2021-01-05 10:46
 * @description 项目信息类
 */
public class Project implements IProject {

    /**
     * 项目名称
     */
    private String name;

    /**
     * 项目成员人数
     */
    private int num;

    /**
     * 项目费用
     */
    private int cost;

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public String getProjectInfo() {
        return String.format("项目名称: %s, 项目人数: %s, 项目费用: %s", name, num, cost);
    }
}
