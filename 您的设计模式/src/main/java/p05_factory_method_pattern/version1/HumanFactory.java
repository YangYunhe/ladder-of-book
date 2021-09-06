package p05_factory_method_pattern.version1;

/**
 * @author YangYunhe
 * @date 2020-12-31 14:17
 * @description
 */
public class HumanFactory {

    public static Human createHuman(Class c) {
        Human human = null;
        try {
            human = (Human)Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException e) {
            System.out.println("人种定义错误");
        } catch (InstantiationException e) {
            System.out.println("必须指定人种颜色");
        } catch (ClassNotFoundException e) {
            System.out.println("指定的人种找不到");
        }
        return human;
    }

}
