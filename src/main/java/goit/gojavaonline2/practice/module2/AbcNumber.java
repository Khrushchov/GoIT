package goit.gojavaonline2.practice.module2;

import java.util.ArrayList;
import java.util.Arrays;

public class AbcNumber {
    public int convert(String num) {
        Character[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        ArrayList<Character> abcList = new ArrayList<Character>(Arrays.asList(abc));

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            int index = abcList.indexOf(num.charAt(i));
            result.append(String.valueOf(index));
        }
        return Integer.valueOf(result.toString());
    }
}
