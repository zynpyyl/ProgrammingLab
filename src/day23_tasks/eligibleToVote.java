package day23_tasks;

import jdk.swing.interop.SwingInterOpUtils;

public class eligibleToVote {
    public static void main(String[] args) {

        eligibleToVote(16,"US");

    }


  public static void eligibleToVote(int age,String citizenship){

        if(age>18&&citizenship.equals("US")){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
  }


}