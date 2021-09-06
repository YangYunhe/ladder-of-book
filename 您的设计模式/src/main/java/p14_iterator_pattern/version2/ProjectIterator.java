package p14_iterator_pattern.version2;

import java.util.ArrayList;

/**
 * @author YangYunhe
 * @date 2021-01-05 11:49
 * @description
 */
public class ProjectIterator implements IProjectIterator {

    private ArrayList<IProject> projectList;
    private int currentItem;

    public ProjectIterator(ArrayList<IProject> projectList) {
        this.projectList = projectList;
    }

    @Override
    public boolean hasNext() {
        return currentItem < projectList.size();
    }

    @Override
    public IProject next() {
        return projectList.get(currentItem++);
    }

    @Override
    public void remove() {
        // 暂时没有用到
    }
}
