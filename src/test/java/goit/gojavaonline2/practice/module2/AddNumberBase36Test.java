package goit.gojavaonline2.practice.module2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class AddNumberBase36Test {
    private final String a, b;
    private final String expected;
    AddNumberBase36 sut = new AddNumberBase36();

    public AddNumberBase36Test(String a, String b, String expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(
            new Object[]{"0", "1", "1"},
            new Object[]{"1", "2", "3"},
            new Object[]{"a", "1", "b"},
            new Object[]{"z", "1", "10"},
            new Object[]{"a", "b", "l"},
            new Object[]{"zjfghfhdsdfathjjhgjhghjfjfjhjhdsrreqqklhu456hfz5",
                    "wsfgsgds56346263fgfhghfghfhgfsrr5476hjfgdhdhg3N",
                    "10g7vy7xrkildxnlpkvzwxy0uzwyyzx6kiwixx24xahmjyw2s"}
        );
    }

    @Test
    public void testAdd() throws Exception {
      String actual = sut.add(a, b);
        Assert.assertEquals(actual, expected);
    }
}