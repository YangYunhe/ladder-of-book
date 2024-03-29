package chapter05;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import chapter04.Dish;
import static chapter04.Dish.menu;

/**
 * @Author yangyunhe
 * @CreateDate 2021-07-05
 * @Description
 */
public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        int sum2 = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum2);

        int max = numbers.stream().reduce(0, (a, b) -> Integer.max(a, b));
        System.out.println(max);

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        min.ifPresent(System.out::println);

        int calories = menu.stream().map(Dish::getCalories).reduce(0, Integer::sum);
        System.out.println("Number of calories:" + calories);

    }

}
