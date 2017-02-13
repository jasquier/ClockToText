package squier.john.clockToText;

import org.junit.rules.ExpectedException;

/**
 * Created by johnsquier on 2/13/17.
 */
public class BadClockInput extends Exception {

    public String printBadClockInputMessageToSTDOUT() {
        String message = "YOU HAVE ENTERED A BAD INPUT";
        System.out.println(message);
        return message;
    }
}
