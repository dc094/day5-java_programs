package com.bridge;

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        int x, swap = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        x = sc.nextInt();
        System.out.println("before swapping: " + x);

        while (x != 0) {      // loop until x becomes 0
            int digit = x % 10;    // get last digit from value of x
            swap = swap * 10 + digit;

            x /= 10;   // remove last digit from value of x
        }
        System.out.println("after swapping: " + swap);
    }
}
