package queue_poland;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] arg) {

        String str;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите математическое выражение в инфиксной форме записи:");
        str = scan.nextLine().strip().replaceAll("\\s+", "");
        System.out.println(str);

        //String[] nums = str.split("[\\(\\)\\-+*/]");
        //String[] operators = str.split("[^\\(\\)\\-+*/]");

        Pattern pattern = Pattern.compile("\\([^\\(\\)]+\\)");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
