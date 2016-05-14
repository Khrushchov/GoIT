package goit.gojavaonline2.practice.module2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class SetZeroTest {
    private final int num, i, expected;
    SetZero sut = new SetZero();

    public SetZeroTest(int num, int i, int expected) {
        this.num = num;
        this.i = i;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {

        return Arrays.asList(
                new Object[]{6, 2, 4},
                new Object[]{16, 1, 16},
                new Object[]{3, 1, 2},
                new Object[]{3, 5, 3},
                new Object[]{-1, 31, -1073741825}
        );
    }

    @Test
    public void testSet() throws Exception {
        int actual = sut.set(num, i);
        Assert.assertEquals(expected, actual);
    }
}