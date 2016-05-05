package goit.gojavaonline2.practice.module1;

public class MatrixTraversal {
    public int[] print(int[][] input) {
        int inputSize = input[0].length * input.length;
        int[] output = new int[inputSize];
        int index = 0;
        int leftElIndex = 0;
        int rightElIndex = input[0].length - 1;
        int topElIndex = 0;
        int bottomElIndex = input.length - 1;

        while (index < inputSize)
            {
                for (int i = leftElIndex; i <= rightElIndex; i++) {
                    if (index == inputSize){break;}
                    output[index++] = input[topElIndex][i];
                }
                topElIndex++;

                for (int j = topElIndex; j <= bottomElIndex; j++) {
                    if (index == inputSize){break;}
                    output[index++] = input[j][rightElIndex];
                }
                rightElIndex--;

                for (int k = rightElIndex; k >= leftElIndex; k--) {
                    if (index == inputSize){break;}
                    output[index++] = input[bottomElIndex][k];
                }
                bottomElIndex--;

                for (int m = bottomElIndex; m >= topElIndex; m--) {
                    if (index == inputSize){break;}
                    output[index++] = input[m][leftElIndex];
                }
                leftElIndex++;
            }
        return output;
    }
}
