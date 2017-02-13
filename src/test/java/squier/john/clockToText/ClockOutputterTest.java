package squier.john.clockToText;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 2/13/17.
 */
public class ClockOutputterTest {

    Clock clock1, clock2, clock3;
    ClockOutputter clockOutputter1, clockOutputter2, clockOutputter3;

    @Before
    public void setup() {
        clock1 = new Clock("3", "30", "am");
        clockOutputter1 = new ClockOutputter(clock1);

        clock2 = new Clock("12", "00", "am");
        clockOutputter2 = new ClockOutputter(clock2);

        clock3 = new Clock("5", "55", "pm");
        clockOutputter3 =  new ClockOutputter(clock3);
    }

    @Test
    public void printClockToSTDOUTInWordForm() {
        String expected = "three thirty pm";

        String actual = clockOutputter1.printClockToSTDOUTInWordForm();

        Assert.assertEquals(expected, actual);
    }
}
