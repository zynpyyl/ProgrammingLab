package day09_tasks;

import javax.lang.model.SourceVersion;

public class SalaryAfterTax {
    public static void main(String[] args) {
        /*
        2. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax
         */
        int salary=90000;
        double salaryAfterTax;
        boolean isMarried=false;

        if (salary>=130000){
            salaryAfterTax=salary*(1-0.35);
        }
        else if (salary>=100000){
            salaryAfterTax=salary*(1-0.3);
        }
        else if (salary>=80000){
            salaryAfterTax=salary*(1-0.25);
        }
        else{
            salaryAfterTax=salary*(1-0.2);
        }

        if (isMarried){
            salaryAfterTax=salaryAfterTax-(salary*0.05);
        }

        System.out.println("salaryAfterTax = " + salaryAfterTax);


    }
}
