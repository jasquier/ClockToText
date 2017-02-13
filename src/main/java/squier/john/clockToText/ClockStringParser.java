package squier.john.clockToText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by johnsquier on 2/13/17.
 */
public class ClockStringParser {

    String inputToParse;
    Pattern hoursPattern;
    Pattern minutesPattern;
    Pattern meridiemPattern;
    Matcher matcher;

    public ClockStringParser(String inputToParse) {
        this.inputToParse = inputToParse;
        hoursPattern = Pattern.compile("^\\d+");
        minutesPattern = Pattern.compile("[^:]\\d+");
        meridiemPattern = Pattern.compile("[^\\d]\\D+");
    }

    public Clock splitClockStringIntoHoursMinsMeridiem() {
        String hoursAsString;
        String minutesAsString;
        String meridiemAsString;

        try {
            hoursAsString = extractHoursFromInputToParse();
            minutesAsString = extractMinutesFromInputToParse();
            meridiemAsString = extractMeridiemFromInputToParse();
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }

        return null;
    }

    private String extractHoursFromInputToParse() throws Exception {
        matcher = hoursPattern.matcher(inputToParse);

        String hoursAsString = null;

        if ( matcher.find() ) {
            hoursAsString = matcher.group();
        }

        if ( hoursAsString != null ) {
            return hoursAsString;
        }
        else {
            throw new Exception();
        }

    }

    private String extractMinutesFromInputToParse() throws Exception {
        matcher = minutesPattern.matcher(inputToParse);

        String minutesAsString = null;

        if ( matcher.find() ) {
            minutesAsString = matcher.group();
        }

        if ( minutesAsString != null ) {
            return minutesAsString;
        }
        else {
            throw new Exception();
        }

    }

    private String extractMeridiemFromInputToParse() throws Exception {
        matcher = meridiemPattern.matcher(inputToParse);

        String meridiemAsString = null;

        if ( matcher.find() ) {
            meridiemAsString = matcher.group();
        }

        if ( meridiemAsString != null ) {
            return meridiemAsString;
        }
        else {
            throw new Exception();
        }
    }
}
