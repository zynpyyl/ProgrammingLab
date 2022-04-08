package day23_tasks;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class anagram {
    public static void main(String[] args) {

        anagram("listen", "silent");

    }

    public static void anagram(String word1, String word2) {

        char[] arr1 = word1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = word2.toCharArray();
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("anagram");
        }else{
            System.out.println("anagram");
        }
    }









}
//    17. create a method that can check if two strings are anagram
//    		ex:
//    			anagram("silent", "listen")
//			output:
//				silent and listen are anagram