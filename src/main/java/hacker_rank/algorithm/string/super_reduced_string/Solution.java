package hacker_rank.algorithm.string.super_reduced_string;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(reduce(s));
    }

    public static String reduce(String s) {
        if (s.length() == 0) return "Empty String";

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return reduce(s.substring(0, i) + s.substring(i + 2, s.length()));
            }
        }

        return s;
    }
}
