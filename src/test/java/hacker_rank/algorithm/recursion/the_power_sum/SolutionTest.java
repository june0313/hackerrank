package hacker_rank.algorithm.recursion.the_power_sum;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void getNumberOfUnique() throws Exception {
        assertThat(new Solution(10, 2).getNumberOfUnique(), is(1));
        assertThat(new Solution(100, 2).getNumberOfUnique(), is(3));
        assertThat(new Solution(100, 3).getNumberOfUnique(), is(1));
        assertThat(new Solution(55, 2).getNumberOfUnique(), is(1));
        Solution reusableSolution = new Solution(225, 3);
        assertThat(reusableSolution.getNumberOfUnique(), is(2));
        assertThat(reusableSolution.getNumberOfUnique(), is(2));
    }

}