package day13_tasks;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two strings:");
        String s1=scan.nextLine();
        String s2=scan.nextLine();
        int n1=s1.length();
        int n2=s2.length();
        if(n1>n2){
            System.out.println(s1+" is longer");
        }else{
            System.out.println(s2+" is longer");
        }





    }
}
//2. write a program that asks user to enter two strings, and print out the longest string