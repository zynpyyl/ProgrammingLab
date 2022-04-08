package day15_tasks;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        String word=new Scanner(System.in).nextLine();
        String reverse="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+=word.charAt(i);
        }
        System.out.println((word.equalsIgnoreCase(reverse))? "palindrome" : "not palindrome");
    }
}

//	8. Write a program that can check if the given String is palindrome
//				input:
//					Level
//				output:
//					true
//				input:
//					Anna
//				output:
//					true