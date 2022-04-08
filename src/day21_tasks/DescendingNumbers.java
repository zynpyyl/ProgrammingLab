package day21_tasks;

import java.util.Arrays;

public class DescendingNumbers {
    public static void main(String[] args) {

        int[] numbers={3,6,8,2,4,6,2,4,};
        int[] numbersDescending=new int[numbers.length];

        Arrays.sort(numbers);

        int i=numbers.length-1;
        for (int number : numbers) {
            numbersDescending[i--]=number;
        }
        System.out.println(Arrays.toString(numbersDescending));
    }
}
//1. Write a program that sort the array of integer in descending order