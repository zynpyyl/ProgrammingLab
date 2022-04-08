package day28_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        int max=list.get(0);
        for (Integer i : list) {
            if(i>max)
                max=i;
        }
        System.out.println("max = " + max);
    }
}










//5. Write a program that can find the maximum number from an ArrayList of integers
//			list = [1,2,3,4,5];
//			output:
//				5