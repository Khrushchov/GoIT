package goit.gojavaonline2.practice.module2;

import java.math.BigInteger;

public class AddNumberBase36 {
    public String add(String a, String b){
       BigInteger bigIntegerA, bigIntegerB, sum;
        int radix = 36;
       bigIntegerA = new BigInteger(a, radix);
       bigIntegerB = new BigInteger(b, radix);
        sum = bigIntegerA.add(bigIntegerB);
       return sum.toString(radix);
    }
}
