package squier.john.clockToText;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 2/13/17.
 */
public class MeridiemTest {

    Meridiem meridiemAM, meridiemPM;

    @Before
    public void setup() {
        meridiemAM = Meridiem.AM;
        meridiemPM = Meridiem.PM;
    }

    @Test
    public void amToStringTest() {
        String expected = "am";

        String actual = meridiemAM.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void pmToStringTest() {
        String expected = "pm";

        String actual = meridiemPM.toString();

        Assert.assertEquals(expected, actual);
    }
}
