package day33_tasks;

public class Iphone {
    public String model,color,size;
    public double price;
    public static String brand="Iphone";
    public static String OS="IOS";
    public static String madeIn="China";

    public Iphone(String model, String color, String size, double price) {
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+model+" is on a facetime call with the number "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand+" "+model+" is on a facetime call with the e-mail "+email);
    }
    public void call(long phoneNumber){
        System.out.println(brand+" "+model+" is calling the number "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(brand+" "+model+" is texting to the number "+phoneNumber);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=$" + price +
                '}';
    }
}

/*
4. IPhone Task:
		1. Creta a class named IPhone:
				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn
				Add a constructor that can set All the fields (instances)
				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */