import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        CustomParser parser = new CustomParser();
        System.out.println(parser.parseWithBR("страд"));
        System.out.println(parser.parseWithScanner("страд"));

        //таблица умножения
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.printInConsole();

    }
}