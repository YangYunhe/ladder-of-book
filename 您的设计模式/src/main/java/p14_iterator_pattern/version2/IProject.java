package p14_iterator_pattern.version2;

/**
 * @author YangYunhe
 * @date 2021-01-05 11:39
 * @description
 */
public interface IProject {

    /**
     * 增加项目
     * @param name 项目名称
     * @param num 项目成员人数
     * @param cost 项目花费
     */
    void add(String name, int num, int cost);

    /**
     * 获取项目信息
     * @return 项目信息
     */
    String getProjectInfo();

    /**
     * 获得一个迭代器
     * @return IProjectIterator
     */
    IProjectIterator iterator();

}
