package squier.john.clockToText;

import org.junit.Before;

/**
 * Created by johnsquier on 2/15/17.
 */
public class ClockStringValidatorTest {

    ClockStringValidator csv1, csv2, csv3;
    String s1, s2, s3;

    @Before
    public void setup() {
        s1 = "03:30PM";
        s2 = "3:30am";
        s3 = "1530";

        csv1 = new ClockStringValidator(s1);
        csv2 = new ClockStringValidator(s2);
        csv3 = new ClockStringValidator(s3);
    }
}
