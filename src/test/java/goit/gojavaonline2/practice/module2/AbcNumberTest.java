package goit.gojavaonline2.practice.module2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class AbcNumberTest {
    AbcNumber sut = new AbcNumber();
    String num;
    int expected;

    public AbcNumberTest(String num, int expected) {
        this.num = num;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {

        return Arrays.asList(
            new Object[]{"bcd", 123},
            new Object[]{"bfg", 156}
        );
    }

    @Test
    public void testConvert() throws Exception {
        int actual = sut.convert(num);
        Assert.assertEquals(expected, actual);
    }
}