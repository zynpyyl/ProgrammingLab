package day21_tasks;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};
        int[] arr4 = new int[arr1.length+arr2.length+arr3.length];
        int i=0;
        for (int num : arr1) {
            arr4[i++]=num;
            }
        for (int num : arr2) {
            arr4[i++]=num;
        }
        for (int num : arr3) {
            arr4[i++]=num;
        }
        System.out.println(Arrays.toString(arr4));
    }
}



//5. Write a program that can merge 3 arrays of integers
//    		Ex:
//    			arr1 = {30, 10, 20};
//    			arr2 = {15, 40, 25, 35};
//    			arr3 = {8, 9, 17, 5, 4, 1}
//			Output:
//				{30,10,20,15,40,25,35,8,9,17,5,4,1}