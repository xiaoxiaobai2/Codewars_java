package Codewars_pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int n=0;
        int len=binary.size()-1;
        for (int b: binary) {
            n += b*(Math.pow(2,len));
            len--;
        }
        return n;
    }

    public static int ConvertBinaryArrayToInt_(List<Integer> binary) {

        int number = 0;
        for (int bit : binary)
            number = number << 1 | bit;
        return number;
    }
    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));
        System.out.println(ConvertBinaryArrayToInt_(new ArrayList<>(Arrays.asList(1,0,0,1))));
    }
}
