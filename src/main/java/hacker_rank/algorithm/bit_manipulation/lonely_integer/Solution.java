package hacker_rank.algorithm.bit_manipulation.lonely_integer;

import java.util.Arrays;

public class Solution {
    public static int lonelyInteger(int[] a) {
        int lonelyInteger = 0;

        for (int i : a) {
            lonelyInteger = lonelyInteger ^ i;
        }

        return lonelyInteger;
    }

    public static int lonelyIntegerByStream(int[] a) {
        return Arrays.stream(a).reduce(0, (l, r) -> l ^ r);
    }
}
