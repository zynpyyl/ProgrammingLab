package day23_tasks;

public class eligibleToBuyAlcohol {
    public static void main(String[] args) {

        eligibleToBuyAlcohol(19);

    }



    public static void eligibleToBuyAlcohol(int age){

        if(age>18){
            System.out.println("Eligible to buy alcohol");
        }else
            System.out.println("Not eligible to buy alcohol");
    }


}
