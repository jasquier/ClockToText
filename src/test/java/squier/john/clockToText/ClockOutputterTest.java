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
    public void printCloc1ToSTDOUTInWordFormTest() {
        String expected = "three thirty am";

        String actual = clockOutputter1.printClockToSTDOUTInWordForm();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printClock2ToSTDOUTInWordFormTest() {
        String expected = "twelve am";

        String actual = clockOutputter2.printClockToSTDOUTInWordForm();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printClock3ToSTDOUTInWordFormTest() {
        String expected = "five fifty-five pm";

        String actual = clockOutputter3.printClockToSTDOUTInWordForm();

        Assert.assertEquals(expected, actual);
    }
}
