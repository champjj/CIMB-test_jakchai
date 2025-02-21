package com.example;

public class Main {
        public static void main(String[] args) {
        // exam 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Exam 1 Example 1: " + Exam1.arrProfit(prices1));

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Exam 1 Example 2: " + Exam1.arrProfit(prices2));

        // exam 2
        System.out.println("Exam 2 Example 1: " + Exam2.checkVersion("1.01", "1.001"));
        System.out.println("Exam 2 Example 2: " + Exam2.checkVersion("1.0", "1.0.0"));
        System.out.println("Exam 2 Example 3: " + Exam2.checkVersion("0.1", "1.1"));

        //exam 3
        System.out.println("Exam 3 Example 1: " + Exam3.stairCase(2));
        System.out.println("Exam 3 Example 2: " + Exam3.stairCase(3));
    }
}
