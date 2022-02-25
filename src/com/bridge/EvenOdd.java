package com.bridge;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        if (num % 2 == 0)   // if no. is divisible by 2 then it's an even no.
            System.out.println("The number is even number");
        else
            System.out.println("The number is odd number");
    }
}
