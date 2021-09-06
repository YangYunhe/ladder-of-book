package chapter03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author yangyunhe
 * @CreateDate 2021-06-09
 * @Description 环绕执行模式
 */
public class ExecuteAround {

    @FunctionalInterface
    public interface BufferedReaderProcessor {
        String process(BufferedReader br) throws IOException;
    }

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("java-8-in-action\\src\\main\\resources\\data.txt"))) {
            return p.process(br);
        }
    }

    /**
     * 代码不灵活，只能返回一行数据
     */
    public static String processFileLimited() throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader("java-8-in-action\\src\\main\\resources\\data.txt"))) {
            return br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {

        // method we want to refactor to make more flexible
        String result = processFileLimited();
        System.out.println(result);

        System.out.println("---");

        String oneLine = processFile((BufferedReader b) -> b.readLine());
        System.out.println(oneLine);

        String twoLines = processFile((BufferedReader b) -> b.readLine() + b.readLine());
        System.out.println(twoLines);

    }

}
