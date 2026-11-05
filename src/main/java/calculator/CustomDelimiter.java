package calculator;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 커스텀 구분자 계산
public class CustomDelimiter {

    public static int calculate(String input) {

        Pattern pattern = Pattern.compile("//(.*?)(?:\\n|\\\\n)(.*)");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            String customSeparator = matcher.group(1); // ";" 추출
            String targetText = matcher.group(2);      // "1;2;3" 추출

            // "//;\n"처럼 커스텀 구분자만 있고 계산할 숫자가 없는 경우 0 반환
            if (targetText == null || targetText.isBlank()) {
                return 0;
            }

            // 특수문자가 구분자일 경우를 대비해 Pattern.quote() 사용 안전성 확보
            String[] arr = targetText.split(Pattern.quote(customSeparator));

            return Sum.sum(arr);
        }
        throw new IllegalArgumentException("커스텀 구분자 형식이 올바르지 않습니다.");
    }
}
