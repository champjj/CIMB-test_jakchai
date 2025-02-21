package com.example;

public class Exam3 {

        public static int stairCase(int steps) {
            if (steps == 1) return 1;
            
            int prev = 1;
            int next = 2;
            int current = 0;
            
            // for more 2 steps
            for (int i = 3; i <= steps; i++) {
                current = prev + next;  // sum i
                prev = next;  // set prev by next
                next = current;  // set next by current
            }
            
            return next;
        }
    
    }
    
