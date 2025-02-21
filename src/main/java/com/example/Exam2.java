package com.example;

public class Exam2 {

    public static int checkVersion(String version1, String version2) {
        // split version by dot (.)
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int lenToint1 = v1.length;
        int lenToInt2 = v2.length;
        int maxLen = Math.max(v1.length, v2.length);

        // add 0 for short version
        for (int i = 0; i < maxLen; i++) {
            int num1 = (i < lenToint1) ? Integer.parseInt(v1[i]) : 0;
            int num2 = (i < lenToInt2) ? Integer.parseInt(v2[i]) : 0;

            // check version for revision
            if (num1 < num2) {
                return -1;
            } else if (num1 > num2) {
                return 1;
            }
        }

        // if equal return 0
        return 0;
    }
}