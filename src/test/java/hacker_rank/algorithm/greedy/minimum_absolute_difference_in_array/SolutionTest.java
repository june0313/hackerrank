package hacker_rank.algorithm.greedy.minimum_absolute_difference_in_array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by wayne on 2017. 3. 18..
 *
 */
public class SolutionTest {

    @Test
    public void getMinimumAbsoluteDifference() throws Exception {
        assertThat(Solution.getMinimumAbsoluteDifference(new int[]{3, -7, 0}), is(3));
        assertThat(Solution.getMinimumAbsoluteDifference(new int[]{0, -7, 3}), is(3));
        assertThat(Solution.getMinimumAbsoluteDifference(new int[]{1, 20, -19}), is(19));
    }

}