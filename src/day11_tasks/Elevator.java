package day11_tasks;

import javax.print.attribute.standard.PresentationDirection;

public class Elevator {
    public static void main(String[] args) {
        /*  2. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"
    		 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed      */
        int floorNumber=3;
        String floor="";
        if(floorNumber==1||floorNumber==2||floorNumber==3){
            floor=(floorNumber==1)? "Floor 1 selected. Companies: Lobby, Verizon, Starbucks" :(floorNumber==2)?
            "Floor 2 selected. Companies: Cybertek, NASA, Intelsat" : "Floor 3 selected. Companies: Lyft, BofA, Stake house";
        }else{
            floor="Invalid floor - "+floorNumber;
        }
        System.out.println(floor);
        System.out.println("----------------");
        switch(floorNumber){
            case 1:
                floor="Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                break;
            case 2:
                floor="Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                break;
            case 3:
                floor="Floor 3 selected. Companies: Lyft, BofA, Stake house";
                break;
            default:
                floor="Invalid floor - "+floorNumber;
        }
        System.out.println(floor);
        System.out.println("----------------");
        if(floorNumber==1||floorNumber==2||floorNumber==3) {
            switch (floorNumber) {
                case 1:
                    floor = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                    break;
                case 2:
                    floor = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                    break;
                default:
                    floor = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }
        }else{
                floor="Invalid floor - "+floorNumber;
            }
        System.out.println(floor);

    }
}
