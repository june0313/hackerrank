package hacker_rank.algorithm.string.two_characters;

import java.util.Scanner;

public class TwoCharSolution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        System.out.println(getLength(s));
    }

    public static int getLength(String s) {
        int maxLength = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                char ch1 = chars[i];
                char ch2 = chars[j];

                if (ch1 == ch2) continue;

                StringBuilder stringBuilder = new StringBuilder();
                for (char c : chars) {
                    if (c == ch1 || c == ch2) {
                        stringBuilder.append(c);
                    }
                }

                String candidate = stringBuilder.toString();
                if (check(candidate) && maxLength <= candidate.length()) {
                    maxLength = candidate.length();
                }

            }
        }
        return maxLength;
    }

    public static boolean check(String candidate) {
        char[] chars = candidate.toCharArray();
        for (int i = 0; i < chars.length - 1; i++)
            if (chars[i] == chars[i + 1])
                return false;
        return true;
    }
}
