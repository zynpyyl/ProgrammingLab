package day36_tasks.phone;

public class Iphone extends Phone {

    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber+ " is making a call with facetime");
    }
    public void faceTime(String email){
        System.out.println(email+ " is making a call with facetime");
    }
}





/*
1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */