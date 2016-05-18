package goit.gojavaonline2.practice.module3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class UnixPathTest {
    private final String input;
    private final String expected;
    UnixPath sut = new UnixPath();


    public UnixPathTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {

        return Arrays.asList(
                new Object[]{"/home/../var/./lib//file.txt", "/var/lib/file.txt"},
                new Object[]{"/var//lib/...", "/var/lib"},
                new Object[]{"/../../../...", "/"},
                new Object[]{"/././...", "/"},
                new Object[]{"/var/lib/../log/./../tmp/data///.", "/var/tmp/data"},
                new Object[]{"/.", "/"}
        );
    }

    @Test
    public void testSimplify() throws Exception {
        String actual = sut.simplify(input);
        Assert.assertEquals(expected, actual);

    }
}