package day10_tasks;

public class Loans {
    public static void main(String[] args) {
        /*6. Create a class called Loans, Given two variables salary and credit score,
        use those given info to determine if you can get a loan.
        To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650
                        Otherwise print: "Loan Denied"
        NOTE: MUST USE TERNARY.   */
        int salary=50000;
        int creditSscore=700;
        String result=(salary>60000&& creditSscore>650)? "Loan approved" : "Loan denied";
        System.out.println("result = " + result);
    }
}
