package hacker_rank.algorithm.string.super_reduced_string;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by wayne on 2017. 3. 18..
 */
public class SolutionTest {

    @Test
    public void reduce() throws Exception {
        assertThat(Solution.reduce("aaabccddd"), is("abd"));
        assertThat(Solution.reduce("baab"), is("Empty String"));
        assertThat(Solution.reduce("abcde"), is("abcde"));
        assertThat(Solution.reduce("afbbfcddde"), is("acde"));
        assertThat(Solution.reduce(""), is("Empty String"));
        assertThat(Solution.reduce("abcddcba"), is("Empty String"));
        assertThat(Solution.reduce("aa"), is("Empty String"));
    }

}