package squier.john.clockToText;

/**
 * Created by johnsquier on 2/13/17.
 */
public class BadParseException extends Exception {

    public String printBadParseExceptionMessageToSTDERR() {
        String message = "THERE WAS AN ERROR WHILE PARSING YOUR INPUT";
        System.err.println(message);
        return message;
    }
}
