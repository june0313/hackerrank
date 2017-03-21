package hacker_rank.algorithm.implementation.apple_and_orange;

import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

public class AppleAndOrangeSolution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startPoint = in.nextInt();
        int endPoint = in.nextInt();
        int appleTree = in.nextInt();
        int orangeTree = in.nextInt();
        int numberOfApple = in.nextInt();
        int numberOfOrange = in.nextInt();
        int[] apples = new int[numberOfApple];
        for (int apple_i = 0; apple_i < numberOfApple; apple_i++) {
            apples[apple_i] = in.nextInt();
        }
        int[] oranges = new int[numberOfOrange];
        for (int orange_i = 0; orange_i < numberOfOrange; orange_i++) {
            oranges[orange_i] = in.nextInt();
        }

        getEachCount(startPoint, endPoint, appleTree, orangeTree, apples, oranges).forEach(System.out::println);
    }

    public static List<Long> getEachCount(int startPoint, int endPoint, int appleTree, int orangeTree, int[] apples, int[] oranges) {
        final IntUnaryOperator ACTUAL_APPLE_POINT = d -> appleTree + d;
        final IntUnaryOperator ACTUAL_ORANGE_POINT = d -> orangeTree + d;
        final IntPredicate IN_HOUSE = d -> (startPoint <= d && d <= endPoint);

        long appleCount = Arrays.stream(apples).map(ACTUAL_APPLE_POINT).filter(IN_HOUSE).count();
        long orangeCount = Arrays.stream(oranges).map(ACTUAL_ORANGE_POINT).filter(IN_HOUSE).count();

        return Arrays.asList(appleCount, orangeCount);
    }

}
