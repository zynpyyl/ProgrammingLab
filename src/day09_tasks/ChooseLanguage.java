package day09_tasks;

import java.util.*;

public class ChooseLanguage {
    public static void main(String[] args) {
        /*3. Creata a class called ChooseLanguage, Given an integer variable named selection
        that has a number between 1~5, Write a program that can select the language based on the number
        that's given in selection and prints the following message:
		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel
         */
        int selection;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please select a number between 1 and 5");
        selection=scan.nextInt();
        String message;
        if (selection==1){
            message="Hello, thank you for your call";
        }else if (selection==2){
            message="Hola, gracias para llamar";
        }else if(selection==3){
            message="Merhaba, aradiginiz icin tesekkurler";
        }else if (selection==4){
            message="Privet, spasibo za vash zvonok";
        }else if (selection==5){
            message="Merci ,pour votre appel";
        }else{
            message="Invalid Number";
        }
        System.out.println(message);


    }
}
