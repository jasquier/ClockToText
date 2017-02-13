package squier.john.clockToText;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 2/13/17.
 */
public class ClockStringParserTest {

    ClockStringParser clockStringParser1;
    String inputToParse1;

    @Before
    public void setup() {
        inputToParse1 = "3:30pm";
        clockStringParser1 = new ClockStringParser(inputToParse1);
    }

    @Test
    public void splitClockStringIntoHoursMinsMeridiem() {
        Clock expected = new Clock("3", "30", "pm");

        Clock actual = clockStringParser1.splitClockStringIntoHoursMinsMeridiem();

        Assert.assertEquals(expected, actual);
    }
}
