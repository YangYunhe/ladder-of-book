package chapter04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @Author yangyunhe
 * @CreateDate 2021-06-30
 * @Description
 */
public class StreamVsCollection {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        for (Dish dish : Dish.menu) {
            names.add(dish.getName());
        }
        names.forEach(System.out::println);
        names.clear();
        System.out.println("---");

        Iterator<Dish> iterator = Dish.menu.iterator();
        while(iterator.hasNext()) {
            Dish dish = iterator.next();
            names.add(dish.getName());
        }
        names.forEach(System.out::println);
        names.clear();
        System.out.println("---");

        names = Dish.menu.stream().map(Dish::getName).collect(toList());
        names.forEach(System.out::println);

        names = Arrays.asList("Java8", "Lambdas", "In", "Action");
        Stream<String> s = names.stream();
        s.forEach(System.out::println);
        // uncommenting this line will result in an IllegalStateException
        // because streams can be consumed only once
        // s.forEach(System.out::println);

    }

}
