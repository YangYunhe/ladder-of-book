package p15_composite_pattern.version3;

/**
 * @author YangYunhe
 * @date 2020-12-29 13:26
 * @description 普通员工很简单，就写一个构造函数就可以了
 */
public class Leaf extends Corp {

    public Leaf(String name, String position, int salary) {
        super(name, position, salary);
    }
}
