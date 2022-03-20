package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double num1[] = {3.4, 5.2, 6.2, -6.2, -6.5, -9.1, -0.1, -9.9, -5.1, -6.2, -7.3, 0.8, 8.8, 0.2, 9.9};
        double average = 0.0;
        int t = 0;
        boolean hook = false;
        for (double el : num1) {
            if (el < 0) {
                hook = true;
            } else if (hook) {
                t++;
                average += el;
            }
        }
        System.out.println(average / t);
    }
}


