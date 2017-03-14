package hacker_rank.algorithm.implementation.grading_students;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int a0 = 0; a0 < n; a0++) {
            int grade = in.nextInt();
//            System.out.println(calculateGrade(grade));
            System.out.println(calculateGradeWithOptional(grade));
        }
    }

    public static int calculateGrade(int grade) {
//        int nextMultipleOfFive = ((5 - (grade % 5)) % 5) + grade;
//
//        if (nextMultipleOfFive >= 40 && nextMultipleOfFive - grade < 3) {
//            return nextMultipleOfFive;
//        }
//
//        return grade;

        return grade < 38 || (grade % 5) < 3  ? grade : grade + 5 - (grade % 5);
     }

    public static int calculateGradeWithOptional(int grade) {
        return Optional.of(grade)
                .filter(g -> g >= 38)
                .filter(g -> (g % 5) >= 3)
                .map(g -> g + 5 - (g % 5))
                .orElse(grade);
    }

}