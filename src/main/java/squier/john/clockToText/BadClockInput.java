package squier.john.clockToText;

import org.junit.rules.ExpectedException;

/**
 * Created by johnsquier on 2/13/17.
 */
public class BadClockInput extends Exception {

    public String printBadClockInputMessageToSTDERR() {
        String message = "YOU HAVE ENTERED A BAD INPUT";
        System.err.println(message);
        return message;
    }
}
