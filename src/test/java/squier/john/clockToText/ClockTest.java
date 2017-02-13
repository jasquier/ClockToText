package squier.john.clockToText;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 2/13/17.
 */
public class ClockTest {

    Clock clock1, clock2, clock3, badClock;
    String hoursAsString1, hoursAsString2, hoursAsString3;
    String minutesAsString1, minutesAsString2, minutesAsString3;
    String meridiemAsStringAM, meridiemAsStringPM;

    @Before
    public void setup() {
        hoursAsString1 = "3";
        hoursAsString2 = "12";
        hoursAsString3 = "3";

        minutesAsString1 = "30";
        minutesAsString2 = "00";
        minutesAsString3 = "30";

        meridiemAsStringAM = "am";
        meridiemAsStringPM = "pm";

        clock1 = new Clock(hoursAsString1, minutesAsString1, meridiemAsStringAM);
        clock2 = new Clock(hoursAsString2, minutesAsString2, meridiemAsStringPM);
        clock3 = new Clock(hoursAsString3, minutesAsString3, meridiemAsStringAM);
        badClock = new Clock("garbage", "in", "garbage out");
    }

    @Test
    public void getHoursAsIntClockOneTest() {
        Integer expected = 3;

        Assert.assertEquals(expected, clock1.getHours());
    }

    @Test
    public void getHoursAsIntClockTwoTest() {
        Integer expected = 12;

        Assert.assertEquals(expected, clock2.getHours());
    }

    @Test
    public void getHoursAsIntBadClockTest() {
        Integer expected = 12;

        Assert.assertEquals(expected, badClock.getHours());
    }

    @Test
    public void getMinutesAsIntClockOneTest() {
        Integer expected = 30;

        Assert.assertEquals(expected, clock1.getMinutes());
    }

    @Test
    public void getMinutesAsIntClockTwoTest() {
        Integer expected = 0;

        Assert.assertEquals(expected, clock2.getMinutes());
    }

    @Test
    public void getMinutesBadClockTest() {
        Integer expected = 0;

        Assert.assertEquals(expected, badClock.getMinutes());
    }

    @Test
    public void getMeridiemClockOneTest() {
        Meridiem expected = Meridiem.AM;

        Assert.assertEquals(expected, clock1.getMeridiem());
    }

    @Test
    public void getMeridiemClockTwoTest() {
        Meridiem expected = Meridiem.PM;

        Assert.assertEquals(expected, clock2.getMeridiem());
    }

    @Test
    public void getMeridiemBadClockTest() {
        Meridiem expected = Meridiem.AM;

        Assert.assertEquals(expected, badClock.getMeridiem());
    }

    @Test
    public void clocksEqualTest() {
        Assert.assertTrue(clock1.equals(clock3));
    }

    @Test
    public void clocksNotEqualTest() {
        Assert.assertFalse(clock1.equals(clock2));
    }
}
