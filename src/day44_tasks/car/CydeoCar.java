package day44_tasks.car;

public class CydeoCar extends Car implements AutoPark,AutoPilot,Flyable {

    public CydeoCar(String model, int year, double price, String color) {
        super("Cydeocar", model, year, price, color);
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

    @Override
    public void fly() {

    }
}
//10 Create a sub class of Car named CydeoCar that implements AutoPark, AutoPilot and Flyable interfaces