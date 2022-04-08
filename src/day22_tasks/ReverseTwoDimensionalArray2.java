package day22_tasks;

import java.util.Arrays;

public class ReverseTwoDimensionalArray2 {

    public static void main(String[] args) {

        int[][] a = {{1,2,3,4},{4,5,6,8},{7,8,9,2,4,5},{10,11,12}};
        int[][] b = new int[a.length][];

        for(int i = 0; i < a.length; i++) {
            b[i] = new int[a[a.length-i-1].length];
            for(int j = 0; j < a[a.length-i-1].length; j++) {
                b[i][j] = a[a.length-1-i][a[a.length-1-i].length - (j + 1)];
            }
        }
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(b));

    }
}
