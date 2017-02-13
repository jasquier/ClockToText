package squier.john.clockToText;

import org.junit.Before;

/**
 * Created by johnsquier on 2/13/17.
 */
public class ClockTest {

    Clock clock1;
    String hoursAsString = "3";
    String minutesAsString = "30";
    String meridiemAsString = "pm";

    @Before
    public void setup() {
        clock1 = new Clock(hoursAsString, minutesAsString, meridiemAsString);
    }
}
