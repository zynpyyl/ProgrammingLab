package day22_tasks;

import java.util.Arrays;

public class Reverse2 {
    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3}, {4,5},{6,5,4}};
        int[][] reverse = new int[arr2D.length][];

        for (int i = arr2D.length - 1, j=0; i >= 0; i--,j++) {

            reverse[j] = new int[arr2D[i].length];

            for (int i1 = arr2D[i].length - 1,j1=0; i1 >= 0; i1--,j1++) {

                reverse[j][j1] = arr2D[i][i1];

            }
        }
        System.out.println(Arrays.deepToString(reverse));
    }
}