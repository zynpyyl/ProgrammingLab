package day09_tasks;

public class OxygenTank {
    /*4. Create a class called OxygenTank. You are diving in the ocean.
    Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%
                USE ONE PRINT STATEMENT ONLY
     */
    public static void main(String[] args) {
        int oxygenLevel=97;
        String levelEx;
        if(oxygenLevel>90){
            levelEx="Your tank is full";
        }
        else if (oxygenLevel>80){
            levelEx="Still okay";
        }
        else if (oxygenLevel>70){
            levelEx="Do not go so far";
        }
        else if(oxygenLevel>60){
            levelEx="Start to head back";
        }
        else{
            levelEx="Be careful now you are at 50%";
        }
        System.out.println("levelEx = " + levelEx);
    }






}
