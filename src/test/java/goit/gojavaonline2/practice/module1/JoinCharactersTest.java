package goit.gojavaonline2.practice.module1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class JoinCharactersTest {
     JoinCharacters sut = new JoinCharacters();
    private final char[] input;
    private final int expected;

    public JoinCharactersTest(char[] input, int expected) {
        this.input = input;
        this.expected = expected;
    }
        @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(
            new Object[]{new char[]{'1'}, 1},
            new Object[]{new char[]{'1', '2'}, 12},
            new Object[]{new char[]{'1', '2', '3'}, 123}
        );
    }

    @Before
    public void setUp() throws Exception {
        sut = new JoinCharacters();
    }

    @Test
    public void testJoin() throws Exception {
        int actual = sut.join(input);
        Assert.assertEquals("Error ", expected, actual);
    }
}