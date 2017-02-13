package squier.john.clockToText;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 2/13/17.
 */
public class BadParseExceptionTest {

    BadParseException badParseException;

    @Before
    public void setup() {
        badParseException = new BadParseException();
    }

    @Test
    public void printBadParseExceptionMessageToSTDOUT() {
        String expected = "THERE WAS AN ERROR WHILE PARSING YOUR INPUT";

        String actual = badParseException.printBadParseExceptionMessageToSTDOUT();

        Assert.assertEquals(expected, actual);
    }
}
