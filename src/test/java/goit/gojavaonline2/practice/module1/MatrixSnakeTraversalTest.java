package goit.gojavaonline2.practice.module1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class MatrixSnakeTraversalTest {
    private final int[][] input;
    private final int[] expected;
    private MatrixSnakeTraversal sut;

    public MatrixSnakeTraversalTest(int[][] input, int[] expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(
                new Object[]{new int[][]{{1, 2}, {3, 4}}, new int[]{1, 3, 4, 2}},
                new Object[]{new int[][]{{1, 2}, {3, 4}, {5, 6}}, new int[]{1, 3, 5, 6, 4, 2}},
                new Object[]{new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[]{1, 4, 7, 8,
                        5, 2, 3, 6, 9}},
                new Object[]{new int[][]{{0, -1, -2}, {-3, -4, -5}}, new int[]{0,
                        -3, -4, -1, -2, -5}}
        );
    }

    @Before
    public void setUp() throws Exception {
        sut = new MatrixSnakeTraversal();
    }

    @Test
    public void testPrint() throws Exception {
        int[] actual = sut.print(input);
        Assert.assertArrayEquals(expected, actual);
    }
}