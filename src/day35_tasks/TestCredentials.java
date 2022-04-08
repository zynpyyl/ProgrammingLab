package day35_tasks;

public class TestCredentials {
    public static void main(String[] args) {
        Credentials credential=new Credentials("Zeynep","Samsun55.");
        Credentials credential2=new Credentials("Zeynep","Samsun$4556");
        Credentials credential3=new Credentials("Zeynep","Samsun& 5");
        Credentials credential4=new Credentials("Zeynep","Samsu&5");
        Credentials credential5=new Credentials("Zeynep","Samsun55");

        System.out.println(credential);
        System.out.println(credential2);
        System.out.println(credential3);
        System.out.println(credential4);
        System.out.println(credential5);
    }
}
