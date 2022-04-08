package day15_tasks;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        String word=new Scanner(System.in).nextLine();
        String reverse="";
        for (int i = word.length()-1; i >=0 ; i--) {
            char ch=word.charAt(i);
            reverse+=ch;
        }
        System.out.println(reverse);
    }
}




/*
	7. Write a program that can reverse any given string
            Ex:
            input:
            Wooden Spoon
            output:
            noopS nedooW  */