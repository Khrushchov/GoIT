package goit.gojavaonline2.practice.module1;

public class FindMaxNumber {
    public int max(int[] input) {
        int max = input[0];
        for (int el :
                input) {
            if (el > max){
                max = el;
            }
        }
        return max;
    }
}
