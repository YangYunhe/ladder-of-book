package chapter05;

import chapter04.Dish;

import java.util.Arrays;
import java.util.List;
import chapter04.Dish;
import static chapter04.Dish.menu;

/**
 * @Author yangyunhe
 * @CreateDate 2021-07-05
 * @Description
 */
public class Mapping {

    public static void main(String[] args) {

        menu.stream().map(Dish::getName).forEach(System.out::println);

        List<String> words = Arrays.asList("Hello", "World");
        words.stream().map(String::length).forEach(System.out::println);

        words.stream().flatMap(line -> Arrays.stream(line.split(""))).distinct().forEach(System.out::println);

        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5);
        List<Integer> numbers2 = Arrays.asList(6,7,8);

        numbers1.stream().flatMap(i -> numbers2.stream().map(j -> new int[]{i, j}))
                .filter(pair -> (pair[0] + pair[1]) % 3 ==0)
                .forEach(pair -> System.out.printf("(%s, %s)%n", pair[0], pair[1]));



    }

}
