package goit.gojavaonline2.practice.module2;

public class SetZero {
    public int set (int num, int i){
        StringBuilder binNum = new StringBuilder(Integer.toBinaryString(num));
        if (i > binNum.length()){
            return num;
        }
        binNum.setCharAt(binNum.length() - i  , '0');

        return  Integer.parseUnsignedInt(binNum.toString(), 2);
    }
}
