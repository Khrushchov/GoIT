package goit.gojavaonline2.practice.module2;

public class CountBits {
    public int count(int num) {
        String binNum = Integer.toBinaryString(num);
        String result = binNum.replace("0", "");
        return result.length();
    }
}
