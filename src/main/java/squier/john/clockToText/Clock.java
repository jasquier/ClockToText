package squier.john.clockToText;

/**
 * Created by johnsquier on 2/13/17.
 */
public class Clock {

    String hoursAsString;
    String minutesAsString;
    String meridiemAsString;
    Integer hours;
    Integer minutes;
    Meridiem meridiem;

    public Clock(String hoursAsString, String minutesAsString, String meridiemAsString) {
        this.hoursAsString =  hoursAsString;
        this.minutesAsString= minutesAsString;
        this.meridiemAsString = meridiemAsString;

        this.hours =  convertHoursStringToInt();
        this.minutes = convertMinutesStringToInt();
        this.meridiem =  convertMeridiemStringToMeridiem();
    }

    private Integer convertHoursStringToInt() {
        return null;
    }

    private Integer convertMinutesStringToInt() {
        return null;
    }

    private Meridiem convertMeridiemStringToMeridiem() {
        return null;
    }
}
