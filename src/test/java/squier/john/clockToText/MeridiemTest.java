package squier.john.clockToText;

import org.junit.Before;

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
}
