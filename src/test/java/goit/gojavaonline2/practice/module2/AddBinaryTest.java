package goit.gojavaonline2.practice.module2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class AddBinaryTest {
    private final String a, b, expected;
    AddBinary sut = new AddBinary();

    public AddBinaryTest(String a, String b, String expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {

        return Arrays.asList(
                new Object[]{"101", "100", "1001"},
                new Object[]{"1", "0", "1"},
                new Object[]{"1", "1", "10"}
        );
    }

    @Test
    public void testAdd() throws Exception {
        String actual = sut.add(a, b);
        Assert.assertEquals(expected, actual);
    }
}