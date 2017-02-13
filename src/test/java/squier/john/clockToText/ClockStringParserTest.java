package squier.john.clockToText;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 2/13/17.
 */
public class ClockStringParserTest {

    ClockStringParser clockStringParser1, clockStringParser2, clockStringParser3;
    String inputToParse1, inputToParse2, inputToParse3;

    @Before
    public void setup() {
        inputToParse1 = "3:30pm";
        clockStringParser1 = new ClockStringParser(inputToParse1);

        inputToParse2 = "11:22am";
        clockStringParser2 = new ClockStringParser(inputToParse2);

        inputToParse3 = "12:00am";
        clockStringParser3 = new ClockStringParser(inputToParse3);
    }

    @Test
    public void splitClockStringIntoHoursMinsMeridiemTestOne() {
        Clock expected = new Clock("3", "30", "pm");

        Clock actual = clockStringParser1.splitClockStringIntoHoursMinsMeridiem();

        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void splitClockStringIntoHoursMinsMeridiemTestTwo() {
        Clock expected = new Clock("11", "22", "am");

        Clock actual = clockStringParser2.splitClockStringIntoHoursMinsMeridiem();

        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void splitClockStringIntoHoursMinsMeridiemTestThree() {
        Clock expected = new Clock("12", "00", "am");

        Clock actual = clockStringParser3.splitClockStringIntoHoursMinsMeridiem();

        Assert.assertTrue(expected.equals(actual));
    }
}
