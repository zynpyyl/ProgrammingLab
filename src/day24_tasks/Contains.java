package day24_tasks;

public class Contains {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int num=10;
        System.out.println(contains(arr,num));
    }
    public static boolean contains(int[] arr,int num){
        boolean contains=false;
        for (int i : arr) {
            if(i==num){
                contains=true;
                break;
            }
        }
        return contains;
    }
}

//9. Create a method named contains that passes one integer array and one integer parameters,
// the method returns true if the given integer is contained in the given array, otherwise returns false
//					arr = {1,2,3,4,5,6,7};
//					num = 10;
//					contains(arr, num) ===> false