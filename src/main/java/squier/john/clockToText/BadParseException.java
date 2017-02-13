package squier.john.clockToText;

/**
 * Created by johnsquier on 2/13/17.
 */
public class BadParseException extends Exception {

    public String printBadParseExceptionMessageToSTDOUT() {
        String message = "THERE WAS AN ERROR WHILE PARSING YOUR INPUT";
        System.out.println(message);
        return message;
    }
}
