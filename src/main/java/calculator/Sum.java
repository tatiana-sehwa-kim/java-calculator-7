package calculator;

import java.util.ArrayList;

// 덧셈
public class Sum {

    public static int sum(String[] list) {
        int total = 0;
        for (String s : list) {
            int num = Integer.parseInt(s);

            if (num < 0) {
                throw new IllegalArgumentException("양수만 입력할 수 있습니다.");
            }
            total += num;
        }
        return total;
    }
}
