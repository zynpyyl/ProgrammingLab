package day20_tasks;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        int[] array={10, 0, 5, 0, 1, 0};
        int[] newArray=new int[6];
        for (int i = 0,j=0 ;i < array.length; i++) {
            if(array[i]!=0) {
                newArray[j] = array[i];
                j++;
            }
            }
        System.out.println(Arrays.toString(newArray));
    }
}
//6. write a program that can move all the zeros to the end of the array
//        Ex:
//            array = {10, 0, 5, 0, 1, 0};
//            output:
//                 {10, 5, 1, 0, 0, 0}