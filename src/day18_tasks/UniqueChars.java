package day18_tasks;

import java.util.Scanner;

public class UniqueChars {
    public static void main(String[] args) {
        String word="";
        System.out.println("Enter a string:");
        String str=new Scanner(System.in).nextLine();
        for (int i = 0; i < str.length() ; i++) {
            int freq=0;
            for (int j = 0; j < str.length() ; j++) {
            if((str.charAt(i)==str.charAt(j))){
                freq++;
            }
            }
                if(freq==1){
                    word+=str.charAt(i);
            }
        }
        System.out.println(word);
    }
}
//5. Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods
//    			Ex:
//                        str = "aabccdeef";
//                        output:
//                                bdf
//            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
//            		if frequency of a character == 1  =========> unique