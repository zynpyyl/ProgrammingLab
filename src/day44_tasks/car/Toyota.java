package day44_tasks.car;

public class Toyota extends Car{

    public Toyota(String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+" "+getModel()+" has start/stop");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+getModel()+" is driven");
    }


}

//5. Create a subclass of Car named Toyota
