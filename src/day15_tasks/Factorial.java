package day15_tasks;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        int num=new Scanner(System.in).nextInt();
        int factorial=1;
        for (int i = num; i >=1 ; i--) {
            factorial*=i;
        }
        System.out.println(num+"!="+factorial);

    }
}
//4. Write a program that can return the factorial number of any given number.
//                input: 5
//                output: 120
//   ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )