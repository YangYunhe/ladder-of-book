package p20_prototype_pattern.clone;

/**
 * @author YangYunhe
 * @date 2021-01-05 17:18
 * @description
 */
public class CloneExample implements Cloneable {

    public CloneExample() {
        System.out.println("调用构造器...");
    }

    @Override
    protected CloneExample clone() throws CloneNotSupportedException {
        return (CloneExample)super.clone();
    }

    public static void main(String[] args) throws Exception {

        CloneExample ce1 = new CloneExample();
        CloneExample ce2 = ce1.clone();
        System.out.println(ce1);
        System.out.println(ce2);

    }
}

