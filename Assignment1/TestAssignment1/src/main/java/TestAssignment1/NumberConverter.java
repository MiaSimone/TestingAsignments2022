package TestAssignment1;

public class NumberConverter {

    public static String numberToNumeral(int number){

//          Thousands	Hundreds	Tens	Units
//        1	M	        C	        X	    I
//        2	MM	        CC	        XX	    II
//        3	MMM	        CCC	        XXX	    III
//        4		        CD	        XL	    IV
//        5		        D	        L	    V
//        6		        DC	        LX	    VI
//        7		        DCC	        LXX	    VII
//        8		        DCCC	    LXXX	VIII
//        9		        CM	        XC	    IX

        // First index in each array should be empty in case the number fx isn't in the thousands, like 160
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String ifThousands = thousands[number/1000];
        String ifHundreds = hundreds[(number % 1000)/100];
        String ifTens = tens[(number % 100)/10];
        String ifUnits = units[number % 10];

        return ifThousands + ifHundreds + ifTens + ifUnits;
    }

}
