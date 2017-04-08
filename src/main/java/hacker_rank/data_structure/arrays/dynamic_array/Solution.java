package hacker_rank.data_structure.arrays.dynamic_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by wayne on 2017. 4. 8..
 * https://www.hackerrank.com/challenges/dynamic-array
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int numberOfQueries = scanner.nextInt();

        DynamicArray dynamicArray = new DynamicArray(n);

        for (int i = 0; i < numberOfQueries; i++) {
            int query = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            dynamicArray.executeQuery(query, x, y);
        }
    }

    static class DynamicArray {
        private final int N;
        private List<List<Integer>> seqList;
        private int lastAns = 0;

        DynamicArray(int n) {
            this.N = n;
            seqList = new ArrayList<>();
            IntStream.range(0, n).forEach(i -> seqList.add(new ArrayList<>()));
        }

        void executeQuery(int query, int x, int y) {
            List<Integer> seq = findSeq(x);

            if (query == 1) {
                seq.add(y);
            } else if (query == 2) {
                lastAns = seq.get(y % seq.size());
                System.out.println(lastAns);
            }
        }

        private List<Integer> findSeq(int x) {
            return seqList.get((x ^ lastAns) % N);
        }
    }

}
