package p14_iterator_pattern.version2;

/**
 * @author YangYunhe
 * @date 2021-01-05 11:59
 * @description
 */
public class Boss {

    public static void main(String[] args) {

        IProject project = new Project();
        // 增加星球大战项目
        project.add("星球大战项目", 10, 100000);
        // 增加扭转时空项目
        project.add("扭转时空项目", 100, 10000000);
        // 增加超人改造项目
        project.add("超人改造项目", 10000, 1000000000);
        // 这边100个项目
        for(int i = 4; i < 104; i++){
            project.add("第" + i + "个项目", i * 5, i * 1000000);
        }
        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()) {
            System.out.println(projectIterator.next().getProjectInfo());
        }
    }

}
