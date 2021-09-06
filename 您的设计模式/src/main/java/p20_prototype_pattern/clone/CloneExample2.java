package p20_prototype_pattern.clone;

import java.util.ArrayList;

/**
 * @author YangYunhe
 * @date 2021-01-05 17:21
 * @description
 */
public class CloneExample2 implements Cloneable {

    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected CloneExample2 clone() throws CloneNotSupportedException {
        /*
         * 浅拷贝
         * return (CloneExample2)super.clone();
         */
        CloneExample2 ce = (CloneExample2)super.clone();
        ce.arrayList = (ArrayList<String>)arrayList.clone();
        return ce;
    }

    public void setValue(String value) {
        arrayList.add(value);
    }

    public ArrayList<String> getValue() {
        return arrayList;
    }

    public static void main(String[] args) throws Exception {
        CloneExample2 ce1 = new CloneExample2();
        ce1.setValue("张三");
        CloneExample2 ce2 = ce1.clone();
        ce2.setValue("李四");
        System.out.println(ce1.getValue()); // 结果是: [张三, 李四]
    }

}
