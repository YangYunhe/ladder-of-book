package p20_prototype_pattern.clone;

import java.util.ArrayList;

/**
 * @author YangYunhe
 * @date 2021-01-05 17:33
 * @description
 */
public class CloneExample3 implements Cloneable {

    private final ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected CloneExample3 clone() throws CloneNotSupportedException {
        CloneExample3 ce = (CloneExample3)super.clone();
        // ce.arrayList = (ArrayList<String>)arrayList.clone(); // 编译报错
        return ce;
    }

    public void setValue(String value) {
        arrayList.add(value);
    }

    public ArrayList<String> getValue() {
        return arrayList;
    }

    public static void main(String[] args) throws Exception {
        CloneExample3 ce1 = new CloneExample3();
        ce1.setValue("张三");
        CloneExample3 ce2 = ce1.clone();
        ce2.setValue("李四");
        System.out.println(ce1.getValue()); // 结果是: [张三]
    }

}
