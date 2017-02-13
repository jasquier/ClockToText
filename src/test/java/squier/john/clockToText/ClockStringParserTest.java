package squier.john.clockToText;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 2/13/17.
 */
public class ClockStringParserTest {

    ClockStringParser clockStringParser;
    String inputToParse;

    @Before
    public void setup() {
        inputToParse = "3:30pm";
        clockStringParser = new ClockStringParser(inputToParse);
    }

    @Test
    public void splitClockStringIntoHoursMinsMeridiem() {

    }
}
