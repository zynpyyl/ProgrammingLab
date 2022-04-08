package day09_tasks;
import java.util.*;

public class AgeGroups {
    public static void main(String[] args) {
        /*5. Create a class called AgeGroups, and write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
         */
        int age;
        String ageGroup;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the age:");
        age=scan.nextInt();
        if (age>=1&&age<=2){
            ageGroup="Infant";
        }else if (age<=5){
            ageGroup="Toddler";
        }else if (age<=9){
            ageGroup="Kid";
        }else if (age<=12){
            ageGroup="Pre-Teen";
        }else if (age<=17){
            ageGroup="Teenager";
        }else if (age<=20){
            ageGroup="Young Adult";
        }else if (age<=39){
            ageGroup="Adult";
        }else if (age<=49){
            ageGroup="Young Middle-Aged Adult";
        }else if (age<=54){
            ageGroup="Middle-Aged Adult";
        }else if (age<=64){
            ageGroup="Very Young Senior Citizen";
        }else if (age<=74){
            ageGroup="Young Senior Citizen";
        }else if (age<=84){
            ageGroup="Senior Citizen";
        }else{
            ageGroup="Old Senior Citizen";
        }
        System.out.println(ageGroup);


    }
}
