package day19_tasks;

import java.util.Scanner;

public class IndexOfFirstDuplicatedChar {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        String str=new Scanner(System.in).nextLine();
        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==2){
                System.out.println("The index number of first duplicated char: "+i);
                break;

            }
        }
    }
}


//. Write a program that cna return the index number of the first duplicated character from a string