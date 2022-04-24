package day44_tasks.car;

public class Audi extends Car implements AutoPark{

    public Audi(String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}

//8. Create two sub class of Car named Audi &  Mercedes that implements AutoPark interface