package p05_factory_method_pattern.version2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @author YangYunhe
 * @date 2020-12-31 14:17
 * @description
 */
public class HumanFactory {

    private static Map<String, Human> humans = new HashMap<>();

    public static Human createHuman(Class c) {
        Human human = null;
        try {
            if (humans.containsKey(c.getSimpleName())) {
                human = humans.get(c.getSimpleName());
            } else {
                human = (Human)Class.forName(c.getName()).newInstance();
                humans.put(c.getSimpleName(), human);
            }
        } catch (IllegalAccessException e) {
            System.out.println("人种定义错误");
        } catch (InstantiationException e) {
            System.out.println("必须指定人种颜色");
        } catch (ClassNotFoundException e) {
            System.out.println("指定的人种找不到");
        }
        return human;
    }

    // 女娲生气了，把一团泥巴塞到八卦炉，哎产生啥人种就啥人种
    public static Human createHuman() {

        // 定义一个类型的人类
        Human human = null;

        // 首先是获得有多少个实现类，多少个人种
        List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class); //定义了多少人种
        // 八卦炉自己开始想烧出什么人就什么人
        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());

        human = createHuman(concreteHumanList.get(rand));

        return human;
    }

}
