package day20_tasks;

public class Task07 {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        int[] array2={4,5,6,7,8};

        for (int i = 0; i < array1.length; i++) {
            for (int i1 = 0; i1 < array2.length; i1++) {
                if(array1[i]==array2[i1]){
                    System.out.print(array1[i]+" ");
                }
            }
        }
    }
}



/*
7. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}
          output:
              4 5

 */