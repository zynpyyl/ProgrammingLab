package day24_tasks;

public class MaxNumber {
    public static void main(String[] args) {
        int[] arr1={3,5,8,1,2,6,9};
        int maximum=maxNumber(arr1);
        System.out.println(maximum);
    }

    public static int maxNumber(int[] arr){
        int max=arr[0];
        for (int each : arr) {
            if(each>max)
                max=each;
        }
        return max;
    }
}
//2. create a method that can return the maximum number from an array of integers