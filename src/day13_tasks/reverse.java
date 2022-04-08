package day13_tasks;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=scan.next();
        int len=word.length();
        if(len>5){
            System.out.println("Too long!");
        }else if(len<5){
            System.out.println("Too short!");
        }else{
            String str=""+word.charAt(4);
            str+=word.charAt(3);
            str+=word.charAt(2);
            str+=word.charAt(1);
            str+=word.charAt(0);

            System.out.println(str);

        }

    }
}

//1.  Create a class called Reverse, write a program that will reverse a string.
//Your program should reverse a string only 5 characters long.
//	If word is shorter, display message: "Too short!".
//	If word is longer, display message: "Too long!".
//	Otherwise, reverse this word and print out result into the console.