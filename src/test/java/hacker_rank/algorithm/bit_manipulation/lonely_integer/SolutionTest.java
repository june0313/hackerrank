package hacker_rank.algorithm.bit_manipulation.lonely_integer;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lonelyInteger() throws Exception {
        assertThat(Solution.lonelyInteger(new int[]{0, 0, 1, 2, 1}), is(2));
        assertThat(Solution.lonelyInteger(new int[]{1}), is(1));
        assertThat(Solution.lonelyInteger(new int[]{1, 1, 2}), is(2));
        assertThat(Solution.lonelyInteger(new int[]{1, 1, 2, 3, 3, 4, 5, 6, 4, 5, 6, 97, 21, 97, 50, 50, 21}), is(2));
    }

    @Test
    public void lonelyInteger2() throws Exception {
        assertThat(Solution.lonelyIntegerByStream(new int[]{0, 0, 1, 2, 1}), is(2));
        assertThat(Solution.lonelyIntegerByStream(new int[]{1}), is(1));
        assertThat(Solution.lonelyIntegerByStream(new int[]{1, 1, 2}), is(2));
        assertThat(Solution.lonelyIntegerByStream(new int[]{1, 1, 2, 3, 3, 4, 5, 6, 4, 5, 6, 97, 21, 97, 50, 50, 21}), is(2));
    }

}