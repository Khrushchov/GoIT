package goit.gojavaonline2.practice.module1;

public class FirstOddNumber {
    public int find(int[] input){
        for (int i = 0; i < input.length; i++) {
            if(input[i]%2 != 0){
                return i;
            }
        }
        return -1;
    }
}
