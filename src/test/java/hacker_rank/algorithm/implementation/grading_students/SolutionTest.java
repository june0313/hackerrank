package hacker_rank.algorithm.implementation.grading_students;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by wayne on 2017. 3. 12..
 */
public class SolutionTest {

    @Test
    public void testGetGrade() throws Exception {
        assertThat(Solution.calculateGrade(37), is(37));
        assertThat(Solution.calculateGrade(38), is(40));
        assertThat(Solution.calculateGrade(73), is(75));
        assertThat(Solution.calculateGrade(69), is(70));
        assertThat(Solution.calculateGrade(15), is(15));
        assertThat(Solution.calculateGrade(67), is(67));
        assertThat(Solution.calculateGrade(33), is(33));
    }

}