package squier.john.clockToText;

/**
 * Created by johnsquier on 2/13/17.
 * @@@ rework the conversion of ints to strings using / and %
 */
public class ClockOutputter {

    private Clock toOutput;

    public ClockOutputter(Clock toOutput) {
        this.toOutput = toOutput;
    }

    public String printClockToSTDOUTInWordForm() {
        StringBuilder output = new StringBuilder();

        output.append(convertHoursIntegerToWord());
        output.append(" ");

        // leave out 0 so 3:00PM becomes three pm
        if ( !convertMinutesIntegerToWord().equals("") ) {
            output.append(convertMinutesIntegerToWord());
            output.append(" ");
        }

        output.append(convertMeridiemToWord());

        System.out.println(output.toString());
        return output.toString();
    }

    private String convertHoursIntegerToWord() {
        switch ( toOutput.getHours() ) {
            case 0: return "";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            default: return "HIT DEFAULT CASE";
        }
    }
    // need to rework this
    private String convertMinutesIntegerToWord() {
        switch ( toOutput.getMinutes() ) {
            case 0: return "";
            case 1: return "oh one";
            case 2: return "oh two";
            case 3: return "oh three";
            case 4: return "oh four";
            case 5: return "oh five";
            case 6: return "oh six";
            case 7: return "oh seven";
            case 8: return "oh eight";
            case 9: return "oh nine";
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            case 20: return "twenty";
            case 21: return "twenty-one";
            case 22: return "twenty-two";
            case 23: return "twenty-three";
            case 24: return "twenty-four";
            case 25: return "twenty-five";
            case 26: return "twenty-six";
            case 27: return "twenty-seven";
            case 28: return "twenty-eight";
            case 29: return "twenty-nine";
            case 30: return "thirty";
            case 31: return "thirty-one";
            case 32: return "thirty-two";
            case 33: return "thirty-three";
            case 34: return "thirty-four";
            case 35: return "thirty-five";
            case 36: return "thirty-six";
            case 37: return "thirty-seven";
            case 38: return "thirty-eight";
            case 39: return "thirty-nine";
            case 40: return "forty";
            case 41: return "forty-one";
            case 42: return "forty-two";
            case 43: return "forty-three";
            case 44: return "forty-four";
            case 45: return "forty-five";
            case 46: return "forty-six";
            case 47: return "forty-seven";
            case 48: return "forty-eight";
            case 49: return "forty-nine";
            case 50: return "fifty";
            case 51: return "fifty-one";
            case 52: return "fifty-two";
            case 53: return "fifty-three";
            case 54: return "fifty-four";
            case 55: return "fifty-five";
            case 56: return "fifty-six";
            case 57: return "fifty-seven";
            case 58: return "fifty-eight";
            case 59: return "fifty-nine";
            default: return "HIT DEFAULT CASE";
        }
    }

    private String convertMinutesIntegerToWord2() {
        // kk here we go,
        // special cases
        //  0 : ""
        //  1 <= x <= 9 : "oh x"
        // 11 <= x <= 19 : "eleven, nineteen, etc"

        // so check x % 10 == 0
        // that means 0, 10, 20, 30, 40, 50
        //  x / 10 = 1,2,3,4,5 put in a switch

        return null;
    }

    private String convertMeridiemToWord() {
        return toOutput.getMeridiem().toString();
    }
}
