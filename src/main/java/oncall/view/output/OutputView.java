package oncall.view.output;

import static oncall.view.output.OutputMessage.EMERGENCY_SCHEDULE;
import static oncall.view.output.OutputMessage.INPUT_HOLIDAY_WORKERS;
import static oncall.view.output.OutputMessage.INPUT_MONTH_AND_DAY;
import static oncall.view.output.OutputMessage.INPUT_WEEKDAY_WORKERS;

public class OutputView {
    public static void printMonthAndDay() {
        System.out.print(INPUT_MONTH_AND_DAY.getMessage());
    }

    public static void printWeekdayWorkers() {
        System.out.print(INPUT_WEEKDAY_WORKERS.getMessage());
    }

    public static void printHolidayWorkers() {
        System.out.print(INPUT_HOLIDAY_WORKERS.getMessage());
    }

    public static void printEmergencySchedule() {
        // 총 n월 날짜만큼 반복해서 수행해야함.
        System.out.println(EMERGENCY_SCHEDULE.getMessage());
    }
}
