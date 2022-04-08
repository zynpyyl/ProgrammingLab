package day27_tasks;

import java.util.Arrays;

public class SwapMethod {

    public static void main(String[] args) {
            int[] arr={1,2,3,4,5,6};
            arr=swap(arr,3,5);
            System.out.println(Arrays.toString(arr));
    }

    public static int[] swap(int[] arr,int index1,int index2){
            int temp=arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp;
            return arr;
    }
    public static double[] swap(double[] arr,int index1,int index2){
        double temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        return arr;
    }
    public static char[] swap(char[] arr,int index1,int index2){
        char temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        return arr;
    }
    public static String[] swap(String[] arr,int index1,int index2){
        String temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        return arr;
    }




}
//2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j.
// the method swaps the element at index i with the element at index j, and returns the new array
//				arr = {10, 20, 30, 40, 50};
//				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}
//	2.2 Create the same function for double array, char array and string array
