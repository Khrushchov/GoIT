package goit.gojavaonline2.practice.module1;

public class JoinCharacters {
    public int join(char[] input) {
        StringBuilder sb = new StringBuilder();
        for (char i : input) {
            sb.append(i);
        }
        return Integer.valueOf(sb.toString());
    }
}
