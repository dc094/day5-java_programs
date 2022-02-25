package com.bridge;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PowerofTwo {
    public static void main(String[] args) {
        // Method 1 -->
//        int n = Integer.parseInt(args[0]);
//        int i = 0;
//        int powerOfTwo = 1;
//
//        while (i <= n) {
//            System.out.println(i + "" + powerOfTwo);
//            powerOfTwo = 2 * powerOfTwo;
//
//            i = i + 1;
//        }
        // Method 2 -->
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number: ");
//        int n = sc.nextInt();
//
//        int i = 0;
//        int powerOfTwo = 1;
//
//        while (i <= n) {
//            System.out.println(i + " = " + powerOfTwo);
//            powerOfTwo = 2 * powerOfTwo;
//            i++;
//        }
        // Method 3 -->
        int baseNumber = 2, exponent;
        long power = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the exponent: ");
        exponent = sc.nextInt();

        while (exponent >= 0 && exponent < 31) {
            power *= baseNumber;
            exponent--;
        }
        System.out.println(baseNumber + " to the power " + exponent + " is: " + power);
    }
}

