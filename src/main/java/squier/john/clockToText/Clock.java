package squier.john.clockToText;

/**
 * Created by johnsquier on 2/13/17.
 * @@@ Fix Equals
 * @@@ make clock constructor take numbers and meridiem enum
 */
public class Clock {

    private String hoursAsString;
    private String minutesAsString;
    private String meridiemAsString;
    private Integer hours;
    private Integer minutes;
    private Meridiem meridiem;

    public Clock(String hoursAsString, String minutesAsString, String meridiemAsString) {
        this.hoursAsString =  hoursAsString;
        this.minutesAsString= minutesAsString;
        this.meridiemAsString = meridiemAsString;

        this.hours =  convertHoursStringToInt();
        this.minutes = convertMinutesStringToInt();
        this.meridiem =  convertMeridiemStringToMeridiem();
    }

    public Clock(Integer hours, Integer minutes, Meridiem meridiem) {
        this.hours = hours;
        this.minutes = minutes;
        this.meridiem = meridiem;
    }

    public Integer getHours() {
        return hours;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public Meridiem getMeridiem() {
        return meridiem;
    }

    private Integer convertHoursStringToInt() {
        try {
            hours = Integer.parseInt(hoursAsString);
        }
        catch( NumberFormatException e ) {
            System.err.println("THERE WAS A PROBLEM CONVERTING YOUR HOURS, DEFAULTING TO 12");
            hours = 12;
        }

        return hours;
    }

    private Integer convertMinutesStringToInt() {
       try {
           minutes = Integer.parseInt(minutesAsString);
       }
       catch( NumberFormatException e ) {
           System.err.println("THERE WAS A PROBLEM CONVERTING YOUR MINUTES, DEFAULTING TO 00");
           minutes = 00;
       }

       return minutes;
    }

    private Meridiem convertMeridiemStringToMeridiem() {
        if ( meridiemAsString.toLowerCase().equals("am") ) {
            meridiem = Meridiem.AM;
        }
        else if ( meridiemAsString.toLowerCase().equals("pm") ) {
            meridiem = Meridiem.PM;
        }
        else {
            System.err.println("THERE WAS A PROBLEM CONVERTING YOUR MERIDIEM, DEFAULTING TO AM");
            meridiem = Meridiem.AM;
        }

        return meridiem;
    }

    // 01:23AM != 1:23AM in this equals!!!
    public boolean equals(Clock other) {
        if ( this.hoursAsString.equals(other.hoursAsString)
                && this.minutesAsString.equals(other.minutesAsString)
                && this.meridiemAsString.equals(other.meridiemAsString) ) {
            return true;
        }
        else {
            return false;
        }
    }
}
