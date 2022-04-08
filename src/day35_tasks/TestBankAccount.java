package day35_tasks;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount("Zeynep Yayla",6654545l,400000);
        System.out.println(account1);
        account1.deposit(200000);
        System.out.println(account1);
        account1.withdraw(500000);
        System.out.println(account1);
        account1.withdraw(200000);
        System.out.println(account1);

    }
}
