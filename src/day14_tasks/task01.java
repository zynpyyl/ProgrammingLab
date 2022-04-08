package day14_tasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( "Enter first word:");
        String word1 = scan.next();
        System.out.println( "Enter second word:");
        String word2 = scan.next();
        scan.close();
        System.out.println(word1.substring(1)+word2.substring(1));
    }
}



// 1. Ask user to enter two words. Print first word without its first character
//        then print the second word without its first character.
//                Input:
//                    apple
//                    banana
//                Output:
//                    ppleanana