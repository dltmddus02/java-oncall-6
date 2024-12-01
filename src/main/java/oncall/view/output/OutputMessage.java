package oncall.view.output;

public enum OutputMessage {
    INPUT_MONTH_AND_DAY("비상 근무를 배정할 월과 시작 요일을 입력하세요>"),
    INPUT_WEEKDAY_WORKERS("평일 비상 근무 순번대로 사원 닉네임을 입력하세요>"),
    INPUT_HOLIDAY_WORKERS("휴일 비상 근무 순번대로 사원 닉네임을 입력하세요>"),
    EMERGENCY_SCHEDULE("%d월 %d일 %s %s");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
