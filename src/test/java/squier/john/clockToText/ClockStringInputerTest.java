package squier.john.clockToText;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

/**
 * Created by johnsquier on 2/13/17.
 */
public class ClockStringInputerTest {

    ClockStringInputer clockStringInputer1, clockStringInputer2, clockStringInputer3, clockStringInputer4;
    ByteArrayInputStream in1, in2, in3, in4;

    @Before
    public void setup() {
        in1 = new ByteArrayInputStream("3:30pm".getBytes());
        clockStringInputer1 = new ClockStringInputer(in1);

        in2 = new ByteArrayInputStream("03:30pm".getBytes());
        clockStringInputer2 = new ClockStringInputer(in2);

        in3 = new ByteArrayInputStream("11:22am".getBytes());
        clockStringInputer3 = new ClockStringInputer(in3);

        in4 = new ByteArrayInputStream("".getBytes());
        clockStringInputer4 = new ClockStringInputer(in4);
    }

    @Test
    public void getClockInputStringTestOne() {
        String expected = "3:30pm";

        String actual = null;

        try {
            actual = clockStringInputer1.getClockInputString("");
        } catch (BadClockInput badClockInput) {
            badClockInput.printBadClockInputMessageToSTDERR();
            badClockInput.printStackTrace();
        }

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getClockInputStringTestTwo() {
        String expected = "03:30pm";

        String actual = null;

        try {
            actual = clockStringInputer2.getClockInputString("");
        } catch (BadClockInput badClockInput) {
            badClockInput.printBadClockInputMessageToSTDERR();
            badClockInput.printStackTrace();
        }

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getClockInputStringTestThree() {
        String expected = "11:22am";

        String actual = null;

        try {
            actual = clockStringInputer3.getClockInputString("");
        } catch (BadClockInput badClockInput) {
            badClockInput.printBadClockInputMessageToSTDERR();
            badClockInput.printStackTrace();
        }

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = BadClockInput.class)
    public void getClockInputStringNoInputTest() throws BadClockInput {
        Assert.assertNull(clockStringInputer4.getClockInputString(""));
    }
}
