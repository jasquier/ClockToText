package squier.john.clockToText;

/**
 * Created by johnsquier on 2/13/17.
 */
public class App {

    public static void main(String[] args) {
        ClockInputHandler clockInputHandler = new ClockInputHandler(System.in);

        String inputTime = null;

        try {
            inputTime = clockInputHandler.getClockInputString("ENTER A TIME IN THE FORM HH:MM:AM");
        } catch (BadClockInput badClockInput) {
            badClockInput.printBadClockInputMessageToSTDERR();
            System.err.println("EXITING NOW");
            System.exit(-1);
        }

        // shouldn't need to null check since program would end on bad input
        ClockStringParser clockStringParser = new ClockStringParser(inputTime);

        Clock theTime = clockStringParser.splitClockStringIntoHoursMinsMeridiem();

        ClockOutputter clockOutputter = new ClockOutputter(theTime);

        clockOutputter.printClockToSTDOUTInWordForm();
    }
}
