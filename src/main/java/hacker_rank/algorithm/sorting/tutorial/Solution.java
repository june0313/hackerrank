package hacker_rank.algorithm.sorting.tutorial;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int size = scanner.nextInt();
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            arrayList.add(scanner.nextInt());
        }

        System.out.println(arrayList.indexOf(value));
    }
}