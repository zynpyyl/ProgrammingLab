package day17_tasks;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
    /*  int num = 0;  // my solution
        while (num >= 0) {
            System.out.println("Enter a number:");
            num = scan.nextInt();
            if (num >= 0)
                sum += num;
        }
        System.out.println("sum = " + sum);
        scan.close(); */

        while (true) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();
            if (num < 0) {
                break;
            }
            sum += num;
        }
        System.out.println("sum = " + sum);
        scan.close();
    }
        }

/* 2. Write a program that calculates the sum of numbers entered by the user until
user enters a negative number.

            hint: you need an infinite loop
 */