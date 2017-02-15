package squier.john.clockToText;

import java.util.regex.Pattern;

/**
 * Created by johnsquier on 2/15/17.
 * This class needs to confirm an input string is valid
 */
public class ClockStringValidator {

    String toValidate;
    Pattern meridiemTime;
    Pattern militaryTime;

    public ClockStringValidator(String toValidate) {
        this.toValidate = toValidate;

        meridiemTime = Pattern.compile("[0\\d]\\d:\\d\\d[aApP][mM]");
        militaryTime = Pattern.compile("\\d\\d\\d\\d");
    }
}
