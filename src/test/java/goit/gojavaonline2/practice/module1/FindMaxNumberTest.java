package goit.gojavaonline2.practice.module1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class FindMaxNumberTest {
    private  final int[] input;
    private  final int expected;
    FindMaxNumber sut;

    public FindMaxNumberTest(int[] input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
       return Arrays.asList(
        new Object[]{new int[]{0}, 0},
        new Object[]{new int[]{-1, 0, 1}, 1},
        new Object[]{new int[]{1, 2, 3, 4}, 4},
        new Object[]{new int[]{-1, -2, -3, -4}, -1},
        new Object[]{new int[]{-2, 0, -3}, 0}
       );
    }

    @Before
    public void setUp() throws Exception {
        sut = new FindMaxNumber();
    }

    @Test
    public void testMax() throws Exception {
        int actual = sut.max(input);Assert.assertEquals(expected, actual);
    }
}