package p18_visitor_pattern.version2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YangYunhe
 * @date 2021-01-04 17:11
 * @description
 */
public class Client {

    public static void main(String[] args) {

        for (Employee employee : mockEmployee()) {
            employee.accept(new Visitor());
        }

    }

    public static List<Employee> mockEmployee() {
        List<Employee> empList = new ArrayList<>();

        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("Java开发");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);

        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("前端开发");
        liSi.setName("李四");
        liSi.setSalary(1900);
        liSi.setSex(Employee.FEMALE);

        Manager wangWu = new Manager();
        wangWu.setPerformance("基本都是负值");
        wangWu.setName("王五");
        wangWu.setSalary(18750);
        wangWu.setSex(Employee.FEMALE);

        empList.add(zhangSan);
        empList.add(liSi);
        empList.add(wangWu);

        return empList;
    }

}
