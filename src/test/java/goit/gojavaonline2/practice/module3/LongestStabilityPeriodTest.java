package goit.gojavaonline2.practice.module3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class LongestStabilityPeriodTest {
    private final int[] gdp;
    private final int expected;
    private LongestStabilityPeriod sut = new LongestStabilityPeriod();

    public LongestStabilityPeriodTest(int[] gdp, int expected) {
        this.gdp = gdp;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(
                new Object[]{new int[]{900, 901, 902}, 2},
                new Object[]{new int[]{899, 890, 891, 892}, 2},
                new Object[]{new int[]{890, 891, 893}, 2},
                new Object[]{new int[]{900, 900, 900, 901, 902, 902, 903, 903}, 4},
                new Object[]{new int[]{901, 901, 901, 902, 902, 903, 903, 902, 902, 901}, 6}

        );
    }
    @Test
    public void testCount() throws Exception {
        int actual = sut.count(gdp);

        Assert.assertEquals(expected, actual);

    }
}