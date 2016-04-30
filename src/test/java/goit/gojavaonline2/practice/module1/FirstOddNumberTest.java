package goit.gojavaonline2.practice.module1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class FirstOddNumberTest {
    private final int[] input;
    private final int expected;
    private FirstOddNumber sut;

    @Before
    public void setUp() throws Exception {
        sut = new FirstOddNumber();
    }

    public FirstOddNumberTest(int[] input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(
                new Object[]{new int[]{0, -3, 2, 1}, 1},
                new Object[]{new int[]{6, 8}, -1},
                new Object[]{new int[]{-6, -8, -3, -5, -14}, 2},
                new Object[]{new int[]{2, 5, -3, 8, 17}, 1}
        );
    }


    @Test
    public void testFind() throws Exception {
        int actual = sut.find(input);
        Assert.assertEquals(expected, actual);
    }
}