package calculator;

// 분류
public class StringCalculator {

    public int calculate(String input) {

        if (input == null || input.isEmpty()) {
            return 0;
        }

        if (input.startsWith("//")) {
            return CustomDelimiter.calculate(input);
        }

        return Delimiter.calculate(input);
    }
}
