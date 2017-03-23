package hacker_rank.algorithm.string.caesar_cipher;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int k = scanner.nextInt();
        System.out.println(encrypt(s, k));
    }

    public static String encrypt(String s, int k) {
        StringBuilder builder = new StringBuilder();

        for (char c : s.toCharArray()) {

            if ('a' <= c && c <= 'z') {
                c = (char) ('a' + ((c -'a' + k) % 26));
            } else if ('A' <= c && c <= 'Z') {
                c = (char) ('A' + ((c - 'A' + k) % 26));
            }

            builder.append(c);
        }

        return builder.toString();
    }

}
