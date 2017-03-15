package hacker_rank.algorithm.string.hackerrank_in_a_string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.regex.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {

    private static final String HACKERRANK = "hackerrank";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            System.out.println(hackerrankInAString(s));
        }
    }

    public static String hackerrankInAString(String s) {

        Queue<Character> queue = new LinkedList<>();
        for (Character c : s.toCharArray()) {
            queue.add(c);
        }

        StringBuilder result = new StringBuilder();

        for (Character c : HACKERRANK.toCharArray()) {
            while (queue.peek() != null) {
                Character currentChar = queue.poll();
                if (currentChar.equals(c)) {
                    result.append(currentChar);
                    break;
                }
            }
        }

        return HACKERRANK.equals(result.toString()) ? "YES" : "NO";
    }

}
