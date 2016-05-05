package goit.gojavaonline2.practice.module1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class MatrixTraversalTest {

    private final int[][] input;
    private final int[] expected;
    private MatrixTraversal sut;

    public MatrixTraversalTest(int[][] input, int[] expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(
                new Object[]{new int[][]{{1, }}, new int[]{1, }},
                new Object[]{new int[][]{{1, 2}, {3, 4}}, new int[]{1, 2, 4, 3}},
                new Object[]{new int[][]{{1, 2}, {3, 4}, {5, 6}}, new int[]{1, 2, 4, 6, 5, 3}},
                new Object[]{new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[]{1, 2, 3, 6,
                        9, 8, 7, 4, 5}},
                new Object[]{new int[][]{{0, -1, -2}, {-3, -4, -5}}, new int[]{0, -1, -2, -5, -4,
                        -3}},
                new Object[]{new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14,
                        15, 16}}, new int[]{1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10}},
                new Object[]{new int[][]{{1, 2, 3, 4, }, {5, 6, 7, 8, }, {9, 10, 11, 12, }}, new
                        int[]{1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7,}}

                );
    }

    @Before
    public void setUp() throws Exception {
        sut = new MatrixTraversal();
    }

    @Test
    public void testPrint() throws Exception {
        int[] actual = sut.print(input);
        Assert.assertArrayEquals(expected, actual);
    }
}