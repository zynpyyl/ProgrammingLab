package day22_tasks;

import java.util.Arrays;

public class ReverseTwoDimensionalArray {
     public static void main(String[] args) {

          int[][] arr = {{1, 2, 3},{4,5},{7,8,9},{10,11,12}};
          int[][] reverse=new int[arr.length][];

          for (int i = arr.length-1,k=0;i>=0;i--,k++) {
               reverse[k]=new int[arr[arr.length-1-k].length];
               for (int j =arr[i].length-1,l=0;j>=0;j--,l++) {
                    reverse[k][l]=arr[i][j];
               }
          }
          System.out.println(Arrays.deepToString(reverse));
     }
}
/* Write a program that can reverse a two dimensional array (return new array)
        Ex:
        array = { {1,2,3}, {4,5,6}};
        output:
        reverse = { {6,5,4}, {3,2,1},}; */