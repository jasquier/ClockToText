package squier.john.clockToText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by johnsquier on 2/13/17.
 * @@@ make parser convert strings to ints and make a clock
 *      that takes numbers in the constructor
 */
public class ClockStringParser {

    private String inputToParse;
    private Pattern hoursPattern;
    private Pattern minutesPattern;
    private Pattern meridiemPattern;
    private Matcher matcher;

    public ClockStringParser(String inputToParse) {
        this.inputToParse = inputToParse;
        hoursPattern = Pattern.compile("^\\d+");
        minutesPattern = Pattern.compile("[^:]\\d+");
        meridiemPattern = Pattern.compile("[^\\d]\\D+");
    }

    public Clock splitClockStringIntoHoursMinsMeridiem() {
        String hoursAsString = null;
        String minutesAsString = null;
        String meridiemAsString = null;

        try {
            hoursAsString = extractHoursFromInputToParse();
            minutesAsString = extractMinutesFromInputToParse();
            meridiemAsString = extractMeridiemFromInputToParse();
            //System.out.println(hoursAsString + " " + minutesAsString + " " + meridiemAsString);
        }
        catch ( BadParseException e ) {
            e.printBadParseExceptionMessageToSTDERR();
            System.err.println("YOU GET A DEFAULT TIME OF 12:00am");
            hoursAsString = "12";
            minutesAsString = "00";
            meridiemAsString = "am";
        }

        Clock newClock = new Clock(hoursAsString, minutesAsString, meridiemAsString);
        return newClock;
    }

    // add range checking to hours 0-12
    private String extractHoursFromInputToParse() throws BadParseException {
        matcher = hoursPattern.matcher(inputToParse);

        String hoursAsString = null;

        if ( matcher.find() ) {
            hoursAsString = matcher.group();
        }

        if ( hoursAsString != null
                && Integer.parseInt(hoursAsString) >= 0
                && Integer.parseInt(hoursAsString) <= 12 ) {
            return hoursAsString;
        }
        else {
            throw new BadParseException();
        }

    }

    // add range checking to minutes 0-59
    private String extractMinutesFromInputToParse() throws BadParseException {
        String[] splitInput = inputToParse.split(":");

        matcher = minutesPattern.matcher(splitInput[1]);

        String minutesAsString = null;

        if ( matcher.find() ) {
            minutesAsString = matcher.group();
        }

        if ( minutesAsString != null
                && Integer.parseInt(minutesAsString) >= 0
                && Integer.parseInt(minutesAsString) <= 59 ) {
            return minutesAsString;
        }
        else {
            throw new BadParseException();
        }

    }

    // extract should be one method and convert should be another
    private String extractMeridiemFromInputToParse() throws BadParseException {
        matcher = meridiemPattern.matcher(inputToParse);

        String meridiemAsString = null;

        if ( matcher.find() ) {
            meridiemAsString = matcher.group();
        }

        if ( meridiemAsString != null
                && (meridiemAsString.toLowerCase().equals("am"))
                    || meridiemAsString.toLowerCase().equals("pm") ) {
            return meridiemAsString;
        }
        else {
            throw new BadParseException();
        }
    }
}
