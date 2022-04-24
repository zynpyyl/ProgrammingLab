package day44_tasks.car;

public class Tesla extends Car implements AutoPark,AutoPilot{

    public Tesla(String model, int year, double price, String color) {
        super("Tesla", model, year, price, color);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}

//9. Create Two sub classes of Car named Tesla & Nio that implements AutoPark & AutoPilot interfaces