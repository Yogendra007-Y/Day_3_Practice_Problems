package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int IS_FULL_TIME1 = 2;
        int IS_PART_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHours = 0;
        int empWage = 0;
        // Taking Random values 0 or 1.
        Random random = new Random();
        int empCheck = random.nextInt(2);
        int empCheck1 = random.nextInt(3);
        // Checking the condition.
        if (empCheck1 == IS_FULL_TIME1) {
            empHours = 8;
        } else if (empCheck1 == IS_PART_TIME) {
            empHours = 4;
        } else {
            empHours = 0;
        }

    }
}
