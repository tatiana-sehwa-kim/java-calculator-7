package calculator;

import camp.nextstep.edu.missionutils.Console;

public class StringCalculatorTest {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();

        int result = calculate(input);
        System.out.println("결과 : {" + result + "}");

    }

    private static int calculate(String input) {

        if (input == null || input.isEmpty()){
            return 0;
        }

        if (input.startsWith("//")) {
            return customDelimiter(input);
        }

        String[] arr = input.split(",|:");
        int sum = 0;
        for (String s : arr) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }

    private static int customDelimiter(String input) {
        return 0;
    }
}
