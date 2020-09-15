import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeNegativeTest {

    @Test
    public void test1() {
        assertEquals(-42, MakeNegative.makeNegative(42));
    }

    @Test
    public void test2() {
        assertEquals(-567, MakeNegative.makeNegative(-567));
    }

    @Test
    public void test3() {
        assertEquals(-5, MakeNegative.makeNegative(5));
    }

    @Test
    public void test4() {
        assertEquals(0, MakeNegative.makeNegative(0));
    }

}