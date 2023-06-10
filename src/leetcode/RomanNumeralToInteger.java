package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralToInteger {

    private static int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    int romanToDecimal(String str)
    {
        // Initialize result
        int res = 0;

        for (int i = 0; i < str.length(); i++) {
            // Getting value of symbol s[i]
            int s1 = value(str.charAt(i));

            // Getting value of symbol s[i+1]
            if (i + 1 < str.length()) {
                int s2 = value(str.charAt(i + 1));

                // Comparing both values
                if (s1 >= s2) {
                    // Value of current symbol // is greater or equalto // the next symbol
                    res = res + s1;
                }
                else {
                    // Value of current symbol is // less than the next symbol
                    res = res + s2 - s1;
                    i++;
                }
            }
            else {
                res = res + s1;
            }
        }

        return res;
    }

    public static void main(String[] args) {


        RomanNumeralToInteger ob = new RomanNumeralToInteger();

        // Considering inputs given are valid
//        MCMIVI
        String str = "MCMIVI";
        System.out.println("Integer form of Roman Numeral " + str +
                 " is "
                + roman(str));

    }


    public static int romanToInts(String romanNumeral){
//        Algorithm to convert Roman Numerals to Integer Number:
//
//        Split the Roman Numeral string into Roman Symbols (character).
        char [] spiltedRomanFigure = romanNumeral.toCharArray();
//        value(spiltedRomanFigure)
//                Convert each symbol of Roman Numerals into the value it represents.
//        Take symbol one by one from starting from index 0:
//        If current value of symbol is greater than or equal to the value of next symbol, then add this value to the running total.
//else subtract this value by adding the value of next symbol to the running total.

        return 0;

    }

    public static int roman(String s) {
        Map<Character, Integer> stringToInteger = new HashMap<Character, Integer>();


        stringToInteger.put('I', 1);
        stringToInteger.put('V', 5);
        stringToInteger.put('X', 10);
        stringToInteger.put('L', 50);
        stringToInteger.put('C', 100);
        stringToInteger.put('D', 500);
        stringToInteger.put('M', 1000);

        s.replace("IIII", "IV");
        s.replace("VIIII", "IX");
        s.replace("XXXXX", "XL");
        s.replace("LXXXX", "XC");
        s.replace("CCCCC", "CD");
        s.replace("DCCCC", "CM");

        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            int s1 = stringToInteger.get(s.charAt(i));;
            if (i + 1 < s.length()) {
                int s2 = stringToInteger.get(s.charAt(i+1));

                // Comparing both values
                if (s1 >= s2) {
                    // Value of current symbol // is greater or equalto // the next symbol
                    res = res + s1;
                }
                else {
                    // Value of current symbol is // less than the next symbol
                    res = res + s2 - s1;
                    i++;
                }
            }
            else {
                res = res + s1;
            }
        }

        return res;

    }

}
