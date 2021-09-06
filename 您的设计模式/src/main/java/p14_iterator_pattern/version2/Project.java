package p14_iterator_pattern.version2;

import java.util.ArrayList;

/**
 * @author YangYunhe
 * @date 2021-01-05 11:43
 * @description
 */
public class Project implements IProject {

    private ArrayList<IProject> projectList = new ArrayList<>();

    private String name;
    private int num;
    private int cost;

    public Project() {}

    private Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        projectList.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        return String.format("项目名称: %s, 项目人数: %s, 项目费用: %s", name, num, cost);
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(projectList);
    }
}
