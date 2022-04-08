package day21_tasks;

import day13_tasks.reverse;

public class Palindromes {
    public static void main(String[] args) {
        String[] str={"anna","level","madam","Java"};
        String[] reversed=new String[str.length];
        int count=0;
        for (String word : str) {
            String reverse="";
            for (int i = word.length()-1; i >=0 ; i--) {
                reverse+=word.charAt(i);
            }
            if(word.equalsIgnoreCase(reverse))
                count++;
        }
        System.out.println(count+ " words are palindrome");
    }
}

// 4. write a program that can count how many palindromes in an array of string
//        Ex:
//            {"anna", "level", "Java"};
//            output:
//                2