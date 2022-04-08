package day24_tasks;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
    	int num = 4;
        int[] arrNew=addElement(arr,num);
        System.out.println(Arrays.toString(arrNew));
    }
    public static int[] addElement(int[] arr,int num){
        int[] arr1=Arrays.copyOf(arr,arr.length+1);
        arr1[arr1.length-1]=num;
        return arr1;
    }
}
//6. create a method named addElement that takes one integer array and one integer,
// the method can add the Integer number after the  last index of the integer array and returns the new array
//    				arr ={1,2,3};
//    				num = 4;
//    				addElement(arr, num) ==> {1,2,3,4}