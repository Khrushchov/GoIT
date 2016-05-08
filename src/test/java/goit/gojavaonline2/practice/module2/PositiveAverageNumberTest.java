package goit.gojavaonline2.practice.module2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class PositiveAverageNumberTest {
    private final int a, b, expected;
    PositiveAverageNumber sut = new PositiveAverageNumber();

    public PositiveAverageNumberTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {

        return Arrays.asList(
          new Object[]{2, 4, 3},
          new Object[]{4, 7, 5},
          new Object[]{0, 1, 0},
          new Object[]{1073741824, 1073741824, 1073741824}
        );
    }

    @Test
    public void testAverage() throws Exception {
        int actual = sut.average(a, b);
        Assert.assertEquals(expected, actual);
    }
}