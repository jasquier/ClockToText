package squier.john.clockToText;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

/**
 * Created by johnsquier on 2/13/17.
 */
public class ClockInputHandlerTest {

    ClockInputHandler clockInputHandler1, clockInputHandler2, clockInputHandler3;
    ByteArrayInputStream in1, in2, in3;

    @Before
    public void setup() {
        in1 = new ByteArrayInputStream("3:30pm".getBytes());
        clockInputHandler1 = new ClockInputHandler(in1);

        in2 = new ByteArrayInputStream("03:30pm".getBytes());
        clockInputHandler2 = new ClockInputHandler(in2);

        in3 = new ByteArrayInputStream("11:22am".getBytes());
        clockInputHandler3 = new ClockInputHandler(in3);
    }

    @Test
    public void getClockInputStringTestOne() {
        String expected = "3:30pm";

        String actual = clockInputHandler1.getClockInputString("");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getClockInputStringTestTwo() {
        String expected = "03:30pm";

        String actual = clockInputHandler2.getClockInputString("");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getClockInputStringTestThree() {
        String expected = "11:22am";

        String actual = clockInputHandler3.getClockInputString("");

        Assert.assertEquals(expected, actual);
    }
}
