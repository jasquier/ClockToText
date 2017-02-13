package squier.john.clockToText;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by johnsquier on 2/13/17.
 */
public class ClockInputHandler {

    private Scanner scanner;

    public ClockInputHandler(InputStream in) {
        scanner = new Scanner(in);
    }

    public String getClockInputString(String prompt) throws BadClockInput {
        System.out.print(prompt);

        if ( scanner.hasNextLine() ) {
            return scanner.nextLine();
        }
        else {
            throw new BadClockInput();
        }
    }

}
