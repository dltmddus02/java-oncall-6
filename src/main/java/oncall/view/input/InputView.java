package oncall.view.input;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String inputMonthAndDay() {
        String monthAndDay = Console.readLine();
        InputValidator.validateMonthAndWeek(monthAndDay);
        return monthAndDay;
    }

    public static String inputWeekdayWorkers() {
        String weekdayWorkers = Console.readLine();
        InputValidator.validateWorkersName(weekdayWorkers);
        return weekdayWorkers;
    }

    public static String inputHolidayWorkers() {
        String holidayWorkers = Console.readLine();
        InputValidator.validateWorkersName(holidayWorkers);
        return holidayWorkers;
    }

//    INPUT_WEEKDAY_WORKER
}
