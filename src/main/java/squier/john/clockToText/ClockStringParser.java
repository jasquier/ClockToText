package squier.john.clockToText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by johnsquier on 2/13/17.
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
            System.out.println(hoursAsString + " " + minutesAsString + " " + meridiemAsString);
        }
        catch ( BadParseException e ) {
            e.printBadParseExceptionMessageToSTDOUT();
            System.out.println("YOU GET A DEFAULT TIME OF 12:00am");
            hoursAsString = "12";
            minutesAsString = "00";
            meridiemAsString = "am";
        }

        Clock newClock = new Clock(hoursAsString, minutesAsString, meridiemAsString);
        return newClock;
    }

    private String extractHoursFromInputToParse() throws BadParseException {
        matcher = hoursPattern.matcher(inputToParse);

        String hoursAsString = null;

        if ( matcher.find() ) {
            hoursAsString = matcher.group();
        }

        if ( hoursAsString != null ) {
            return hoursAsString;
        }
        else {
            throw new BadParseException();
        }

    }

    private String extractMinutesFromInputToParse() throws BadParseException {
        String[] splitInput = inputToParse.split(":");

        matcher = minutesPattern.matcher(splitInput[1]);

        String minutesAsString = null;

        if ( matcher.find() ) {
            minutesAsString = matcher.group();
        }

        if ( minutesAsString != null ) {
            return minutesAsString;
        }
        else {
            throw new BadParseException();
        }

    }

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
