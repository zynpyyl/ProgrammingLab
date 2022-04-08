package day24_tasks;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
		int[] arr2 = {4,5};
        int[] arr3 = mergeArrays(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

    }
    public static int[] mergeArrays(int[] arr1,int[] arr2){
        int[] arr=new int[arr1.length+arr2.length];
        int i=0;
        for (int each : arr1) {
            arr[i++]=each;
        }
        for (int each : arr2) {
            arr[i++]=each;
        }
        return arr;
        }
}
//5. create a method that can merge two arrays and return the new array
//				arr1 = {1,2,3}
//				arr2 = {4,5}
//				{1,2,3,4,5}