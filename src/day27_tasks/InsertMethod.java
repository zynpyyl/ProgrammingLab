package day27_tasks;

import java.util.Arrays;

public class InsertMethod {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        arr=insert(arr,3,10);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] insert(int[] arr,int index,int element){
        int[] arr1=new int[arr.length+1];
        arr1[index]=element;
        for (int i = 0,j=0; i < arr.length; i++,j++) {
           if(i==index) {
                arr1[i] = element;
                j++;
            }
                arr1[j] = arr[i];
            }
        return arr1;
    }
    public static double[] insert(double[] arr,int index,double element){
        double[] arr1=new double[arr.length+1];
        arr1[index]=element;
        for (int i = 0,j=0; i < arr.length; i++,j++) {
            if(i==index) {
                arr1[i] = element;
                j++;
            }
            arr1[j] = arr[i];
        }
        return arr1;
    }
    public static char[] insert(char[] arr,int index,char element){
        char[] arr1=new char[arr.length+1];
        arr1[index]=element;
        for (int i = 0,j=0; i < arr.length; i++,j++) {
            if(i==index) {
                arr1[i] = element;
                j++;
            }
            arr1[j] = arr[i];
        }
        return arr1;
    }
    public static String[] insert(String[] arr,int index,String element){
        String[] arr1=new String[arr.length+1];
        arr1[index]=element;
        for (int i = 0,j=0; i < arr.length; i++,j++) {
            if(i==index) {
                arr1[i] = element;
                j++;
            }
            arr1[j] = arr[i];
        }
        return arr1;
    }

}
//1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
// the method inserts the given element to the given index of the array and returns the new array
//					arr = {10, 20, 30, 40, 50};

//					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}
//		1.2 Create the same function for double array, char array and string array