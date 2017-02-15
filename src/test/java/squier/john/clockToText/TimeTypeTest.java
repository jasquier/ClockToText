package squier.john.clockToText;

import org.junit.Before;

/**
 * Created by johnsquier on 2/15/17.
 */
public class TimeTypeTest {

    TimeType meridiem, military, invalid;

    @Before
    public void setup() {
        meridiem = TimeType.MERIDIEM;
        military = TimeType.MILITARY;
        invalid = TimeType.INVALID;
    }
}
