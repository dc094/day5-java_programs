package com.bridge;

import java.util.Scanner;

public class QuotientandRemainder {
    public static void main(String[] args) {
        int quo = 0;
        int rem = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of divident and divisor: ");
        int divident = sc.nextInt();
        int divisor = sc.nextInt();

        quo = divident / divisor;
        rem = divident % divisor;

        System.out.println("Quotient when " + divident + "/" + divisor + " is: " + quo);
        System.out.println("Remainder when " + divident + " is divided by " + divisor + " is: " + rem);

    }
}
