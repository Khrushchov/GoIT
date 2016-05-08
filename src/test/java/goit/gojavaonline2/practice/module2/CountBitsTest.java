package goit.gojavaonline2.practice.module2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class CountBitsTest {
    private final int num, expected;
    CountBits sut = new CountBits();

    public CountBitsTest(int num, int expected) {
        this.num = num;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {

        return Arrays.asList(
           new Object[]{13, 3},
           new Object[]{16, 1},
           new Object[]{-2147483647, 2}
        );
    }

    @Test
    public void testCount() throws Exception {
        int actual = sut.count(num);
        Assert.assertEquals(expected, actual);
    }
}