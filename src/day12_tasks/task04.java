package day12_tasks;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter miles:");
        int miles=scan.nextInt();
        double km=miles*1.609;
        System.out.println(miles+" miles is equal to "+km+" km");

    }
}
//4. Write a program that can convert Miles to KM
//            Ex:
//                Enter miles:
//                10.0
//                output:
//                10.0 miles equal to 16.09 kilometers