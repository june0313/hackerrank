package hacker_rank.algorithm.dynamic_programming.stock_maximize;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by wayne on 2017. 3. 25..
 *
 */
public class StockMaximizeSolutionTest {

    @Test
    public void getMaxProfit() throws Exception {
        assertThat(getMaxProfit(5, 3, 2), is(0L));
        assertThat(getMaxProfit(1, 2, 100), is(197L));
        assertThat(getMaxProfit(1, 3, 1, 2), is(3L));
        assertThat(getMaxProfit(1, 3, 1, 2, 5, 6), is(18L));
    }

    @Test
    public void getMaxProfit2() throws Exception {
        assertThat(getMaxProfit2(5, 3, 2), is(0L));
        assertThat(getMaxProfit2(1, 2, 100), is(197L));
        assertThat(getMaxProfit2(1, 3, 1, 2), is(3L));
        assertThat(getMaxProfit2(1, 3, 1, 2, 5, 6), is(18L));
    }

    private long getMaxProfit(int ... price) {
        return StockMaximizeSolution.getMaxProfit(price);
    }

    private long getMaxProfit2(int ... price) {
        return StockMaximizeSolution.getMaxProfit2(price);
    }

}