package domini.Dummy;

import domini.util.DisplayedCharLength;

public class TestClass {

    private static final String BLANK = "...";  //TODO()
    private static final String input = "Dominicus0830";

    public static void main(String[ ] args) {
        var length = DisplayedCharLength.getLength(input);
        System.out.println(length);
    }
}
