package day31_tasks;

import day31_tasks.restaurant.Restaurant;
import day31_tasks.restaurant.Server;

public class Test {
    public static void main(String[] args) {

        SalaryCalculator obj = new SalaryCalculator(10,0.4,0.05, 40);

        System.out.println(obj);

        System.out.println("--------------------------");


        Address address1 = new Address(7925, "Jones Branch Dr", "McLean", "VA", "22012");

        System.out.println(address1);

        System.out.println("--------------------------");

        Item item1 = new Item("Wooden Spoon", 3.5, 100);

        System.out.println(item1);

        System.out.println("--------------------------");

        Carpet carpet1 = new Carpet(3.5,4.5,150,false);

        System.out.println(carpet1);

        System.out.println("--------------------------");

        Server server1=new Server("ahmet",7654,24,true);

        System.out.println(server1);

        System.out.println("--------------------------");

        Restaurant vogue=new Restaurant("Zeynep","Istanbul",5);

        Server server2=new Server("jale",8978,24,true);

        vogue.hireServer(server1);
        vogue.hireServer(server2);
        vogue.terminateServer(server1.employeeId);

        System.out.println(vogue);








    }
}
