package day31_tasks;

public class Address {
    public int buildingNumber;
    public String street,city,state,zipCode;

    public Address(int buildingNumber, String street, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return  buildingNumber +" "+ street +
                "\n"+city +" "+state +", " + zipCode;
    }
}
/*
2. Address Task:
	2.1 Create a class named Address
		    Attributes:
		         buildingNumber, street, city, state, zipCode;

		   	Add a constructor to set all the fields

		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012
 */