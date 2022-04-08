package day33_tasks;

public class TestAddress {

    public static void main(String[] args) {

        Address address1 = new Address("KingsHighway", "Brooklyn", "NY", "07654");

        System.out.println(address1);

        System.out.println(Address.country);
        System.out.println(Address.planet);
        System.out.println(address1.country);


    }
}
