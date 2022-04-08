package day13_tasks;

import java.util.Scanner;

public class task01 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence= scan.nextLine();
        char f=sentence.charAt(0);
        char l=sentence.charAt(sentence.length()-1);
        System.out.println("first character is "+f);
        System.out.println("last character is "+l);








}}
//1. write a program that asks user to enter a sentence.
//                then print the first & last characters of the sentence