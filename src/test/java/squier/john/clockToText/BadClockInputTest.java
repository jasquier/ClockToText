package squier.john.clockToText;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 2/13/17.
 */
public class BadClockInputTest {

    BadClockInput badClockInput;

    @Before
    public void setup() {
        badClockInput = new BadClockInput();
    }

    @Test
    public void printBadClockInputMessageToSTDERR() {
        String expected = "YOU HAVE ENTERED A BAD INPUT";

        String actual = badClockInput.printBadClockInputMessageToSTDERR();

        Assert.assertEquals(expected, actual);
    }
}
