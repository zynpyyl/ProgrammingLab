package day18_tasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("King Bed  - 120$");
        System.out.println("Queen Bed - 100$");
        System.out.println("Single Bed-  80$");

        int roomPrice;
        int cost=0;

        while(true){
        System.out.println("Which bedroom do you want to reserve?");
        String roomType= scan.nextLine();
        while(!(roomType.equals("King Bed")||roomType.equals("Queen Bed")||roomType.equals("Single Bed"))){
            System.err.println("Invalid entry.Please enter a valid room type:");
            roomType= scan.nextLine();
        }
        roomPrice=roomType.equals("King Bed")? 120:roomType.equals("Queen Bed")? 100 : 80;
        System.out.println("How many nights?");
        int nights= scan.nextInt();
        scan.nextLine();
        cost+=nights*roomPrice;

        System.out.println("Would you like to reserve another room");
        String a= scan.nextLine().toLowerCase();
        while (!(a.equals("yes")||a.equals("no"))){
            System.err.println("Invalid entry. Please enter yes/no");
            a= scan.next().toLowerCase();
        }
        if(a.equals("no")){
            System.out.println("Your total is "+cost+"$");
            break;
        }



    }
        scan.close();


}}





/*2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry




 */