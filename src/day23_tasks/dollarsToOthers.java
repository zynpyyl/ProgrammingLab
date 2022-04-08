package day23_tasks;

public class dollarsToOthers {
    public static void main(String[] args) {

        dollarsToOther(56);

    }

    public static void dollarsToOther(double dollars){

        double euro=dollars/1.09;
        double trl=dollars*14.5;
        System.out.println(dollars+"$ is equal to "+euro+" euro");
        System.out.println(dollars+"$ is equal to "+trl+" try");



    }


}
//9. create a method that can convert dollar to euro
//10. create a method that can can convert dollar to lira