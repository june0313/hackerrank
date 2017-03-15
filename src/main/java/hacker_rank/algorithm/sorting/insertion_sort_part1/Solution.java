package hacker_rank.algorithm.sorting.insertion_sort_part1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        for (int i = ar.length - 1; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (ar[i] < ar[j]) {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    printArray(ar);
                    ar[j] = temp;
                }
            }
        }
        printArray(ar);
    }

    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }

    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

}

