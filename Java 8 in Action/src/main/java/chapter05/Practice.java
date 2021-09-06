package chapter05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * @Author yangyunhe
 * @CreateDate 2021-07-05
 * @Description
 */
public class Practice {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        // (1) 找出2011年发生的所有交易，并按交易额排序（从低到高）
        transactions.stream().filter(t -> t.getYear() == 2011).sorted(comparing(Transaction::getValue)).forEach(System.out::println);

        // (2) 交易员都在哪些不同的城市工作过？
        transactions.stream().map(t -> t.getTrader().getCity()).distinct().forEach(System.out::println);

        // (3) 查找所有来自于剑桥的交易员，并按姓名排序
        transactions.stream().map(Transaction::getTrader).filter(trader -> "Cambridge".equals(trader.getCity())).map(Trader::getName).distinct().sorted().forEach(System.out::println);

        // (4) 返回所有交易员的姓名字符串，按字母顺序排序
        transactions.stream().map(t -> t.getTrader().getName()).distinct().sorted().forEach(System.out::println);

        // (5) 有没有交易员是在米兰工作的？
        System.out.println(transactions.stream().anyMatch(t -> "Milan".equals(t.getTrader().getCity())));

        // (6) 打印生活在剑桥的交易员的所有交易额
        transactions.stream().filter(t -> "Cambridge".equals(t.getTrader().getCity())).map(Transaction::getValue).forEach(System.out::println);

        // (7) 所有交易中，最高的交易额是多少
        System.out.println(transactions.stream().map(Transaction::getValue).reduce(0, Integer::max));

        // (8) 找到交易额最小的交易
        transactions.stream().map(Transaction::getValue).reduce(Integer::min).ifPresent(System.out::println);
        transactions.stream().min(comparing(Transaction::getValue)).ifPresent(t -> System.out.println(t.getValue()));


    }

}
