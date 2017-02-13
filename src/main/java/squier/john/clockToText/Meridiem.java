package squier.john.clockToText;

/**
 * Created by johnsquier on 2/13/17.
 */
public enum Meridiem {
    AM, PM;

    public String toString() {
        if ( this.equals(Meridiem.AM) ) {
            return "am";
        }
        else {
            return "pm";
        }
    }
}
