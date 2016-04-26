package goit.gojavaonline2.practice.module1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class SumDigitsTest {
private final int number;
private final int expected;
    private SumDigits sut;

    public SumDigitsTest(int number, int sum) {
        this.number = number;
        this.expected = sum;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(
                new Object[]{1, 1},
                new Object[]{12, 3},
                new Object[]{123, 6},
                new Object[]{1230, 6},
                new Object[]{12034, 10},
                new Object[]{-256, 13}
        );

    }

    @Before
    public void setUp() throws Exception {
     sut = new SumDigits();
    }

    @Test
    public void testSum() throws Exception {
       int actual = sut.sum(number);
        Assert.assertEquals(expected, actual);
    }
}