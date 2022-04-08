package day23_tasks;

public class positiveOrNegative {

    public static void main(String[] args) {

        positiveNegative(15);
        positiveNegative(0);
        positiveNegative(-5);


    }

    public static void positiveNegative(int num){

        if(num==0){
            System.out.println(num+" is zero");
        }else if(num>0){
            System.out.println(num+" is positive");
        }else{
            System.out.println(num+" is negative");
        }



    }
}
