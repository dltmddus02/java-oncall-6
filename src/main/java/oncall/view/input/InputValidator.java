package oncall.view.input;

import java.util.regex.Pattern;
import oncall.view.input.exception.InputErrorMessage;
import oncall.view.input.exception.InputException;

public class InputValidator {
    private final static String COMMA = ",";

    public static void validateMonthAndWeek(String input) {
        validateNotNullOrEmpty(input);
        validateMonthAndDayFormat(input);
    }

    //
    public static void validateWorkersName(String input) {
        validateNotNullOrEmpty(input);
        validateWorkersFormat(input);
        // 제대로된 이름인지?
    }

    public static void validateNotNullOrEmpty(String input) {
        if (input == null || input.isBlank()) {
            throw new InputException(InputErrorMessage.INVALID_INPUT);
        }
    }

    public static void validateMonthAndDayFormat(String input) {
        if (!isCorrectMonthAndDayFormat(input)) {
            throw new InputException(InputErrorMessage.INVALID_INPUT);
        }
    }

    private static boolean isCorrectMonthAndDayFormat(String input) {
//        1-12 사이 정수, 뒤에는 일월화수목금토 문자열 -> 컨트롤ㄹ러에서!
//        여기서는 숫자, 문자열 포멧만
        String monthPattern = "[0-9]+";
        String dayPattern = "[가-힣]+";

        String singlePattern = String.format("%s,%s", monthPattern, dayPattern);

        Pattern correctPattern = Pattern.compile(singlePattern);

        return correctPattern.matcher(input).find();
    }

    public static void validateWorkersFormat(String input) {
//        콤마가 포함되어있는지?
//        한글로 이루어져있는지
//        콤마로 구분했을 때 빈 문자열이 있는지 -> "이승연, ,글로" 이런....
        if (!isCorrectWorkersFormat(input)) {
            throw new InputException(InputErrorMessage.INVALID_INPUT);
        }
    }

    private static boolean isCorrectWorkersFormat(String input) {
        String workerNamePattern = "[가-힣]+";

        String repeatPattern = String.format("%s(,%s)*", workerNamePattern, workerNamePattern);

        Pattern correctPattern = Pattern.compile("^" + repeatPattern + "$");

        return correctPattern.matcher(input).find();
    }

    public static void validateDuplicateWorker(String input) {

    }

}
