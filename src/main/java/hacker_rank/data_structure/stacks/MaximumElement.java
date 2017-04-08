package hacker_rank.data_structure.stacks;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/maximum-element
 */
public class MaximumElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stackOfMax = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int queryType = scanner.nextInt();

            if (queryType == 1) {
                int data = scanner.nextInt();
                stack.push(data);

                if (stackOfMax.isEmpty() || data >= stackOfMax.peek()) {
                    stackOfMax.push(data);
                }
            } else if (queryType == 2) {
                Integer pop = stack.pop();
                if (Objects.equals(pop, stackOfMax.peek())) {
                    stackOfMax.pop();
                }
            } else if (queryType == 3) {
                System.out.println(stackOfMax.peek());
            }
        }
    }
}
