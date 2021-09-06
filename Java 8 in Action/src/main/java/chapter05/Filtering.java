package chapter05;

import chapter04.Dish;

import java.util.Arrays;

import static chapter04.Dish.menu;
import static java.util.stream.Collectors.toList;

/**
 * @Author yangyunhe
 * @CreateDate 2021-07-05
 * @Description Stream API 基础使用
 */
public class Filtering {

    public static void main(String[] args) {

        menu.stream().filter(Dish::isVegetarian).collect(toList()).forEach(System.out::println);

        Arrays.asList(1, 2, 1, 3, 3, 2, 4)
                .stream().filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        menu.stream().filter(d -> d.getCalories() > 300).limit(3).forEach(System.out::println);

        menu.stream().filter(d -> d.getCalories() > 300).skip(2).forEach(System.out::println);

        menu.stream().filter(d -> d.getType() == Dish.Type.MEAT).limit(2).forEach(System.out::println);

    }

}
