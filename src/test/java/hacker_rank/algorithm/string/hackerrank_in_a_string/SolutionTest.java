package hacker_rank.algorithm.string.hackerrank_in_a_string;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by wayne on 2017. 3. 15..
 *
 */
public class SolutionTest {

    @Test
    public void hackerrankInAString() throws Exception {
        assertThat(Solution.hackerrankInAString("apple"), is("NO"));
        assertThat(Solution.hackerrankInAString("hackerrank"), is("YES"));
        assertThat(Solution.hackerrankInAString("hereiamstackerrank"), is("YES"));
    }

}