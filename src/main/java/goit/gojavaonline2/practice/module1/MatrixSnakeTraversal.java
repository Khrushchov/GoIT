package goit.gojavaonline2.practice.module1;

public class MatrixSnakeTraversal {
    public int[] print(int[][] input) {
        int[] output = new int[input[0].length * input.length];
        int k = 0;
        for (int i = 0; i < input[0].length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < input.length; j++) {
                    output[k++] = input[j][i];
                }
            } else {
                for (int j = input.length - 1; j >= 0; j--) {
                    output[k++] = input[j][i];
                }
            }
        }
        return output;
    }
}
