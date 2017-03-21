package hacker_rank.algorithm.implementation.apple_and_orange;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AppleAndOrangeSolutionTest {

    @Test
    public void getEachCount() throws Exception {
        List<Long> eachCount = AppleAndOrangeSolution.getEachCount(7, 11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6});
        assertThat(eachCount.get(0), is(1L));
        assertThat(eachCount.get(1), is(1L));
    }

}