package day17_tasks;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Do you want to reserve a room?");
        String a=scan.next().toLowerCase();
        while(!(a.equals("yes")||a.equals("no"))){
            System.err.println("Invalid entry. Please re-enter. Do you want to reserve a room?");
            a= scan.next().toLowerCase();
        }
        if(a.equals("no")){
            System.out.println("Have a nice day");
        }else{
        System.out.println("Which type of room do you want to reserve?");
        scan.nextLine();
        String roomType=scan.nextLine();
        while(!(roomType.equals("King Bed")||roomType.equals("Queen Bed")||roomType.equals("Single Bed"))){
            System.err.println("Invalid room type. Please re-enter:");
            roomType=scan.nextLine();
        }
        if(roomType.equals("King Bed")){
            System.out.println(roomType+" 120$");
        }else if(roomType.equals("Queen Bed")){
            System.out.println(roomType+" 100$");
        }else{
            System.out.println(roomType+" 80$");
        }}
        scan.close();
    }
}







/*  5. Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */