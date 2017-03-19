package hacker_rank.algorithm.recursion.the_power_sum;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/the-power-sum
 */
public class Solution {

    public Solution(int x, int n) {
        this.x = x;
        this.n = n;
    }

    private int x;
    private int n;
    private int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();

        Solution solution = new Solution(x, n);
        System.out.println(solution.getNumberOfUnique());
    }

    public int getNumberOfUnique() {
        if (count != 0) return count;

        count = 0;
        int base = (int) Math.pow(x, (double) 1 / n);
        updateNumberOfUnique(0, base);

        return count;
    }

    private void updateNumberOfUnique(int previousSum, int base) {
        if (base == 0) return;

        int sum = previousSum + (int) Math.pow(base, n);
        if (sum == x) count++;

        updateNumberOfUnique(sum, base - 1);
        updateNumberOfUnique(previousSum, base - 1);
    }

}
