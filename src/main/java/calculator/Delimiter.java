package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 일반 구분자 계산
public class Delimiter {

    static int calculate(String input) {

        String[] arr = input.split(",|:");
        return Sum.sum(arr);

    }
}
