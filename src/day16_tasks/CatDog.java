package day16_tasks;

import java.util.Locale;
import java.util.Scanner;

public class CatDog {
    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        String sentence=new Scanner(System.in).nextLine();
        int len1=sentence.length();
        int len2=sentence.toLowerCase().replace("cat","").length();
        int len3=sentence.toLowerCase().replace("dog","").length();
        int result=(len1-len2)/3+(len1-len3)/3;
        System.out.println(result);

    }
}


//5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence
//	        Ex:
//	            sentence = "caT dog dogG cAt"
//	            output:
//	                true