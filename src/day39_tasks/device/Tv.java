package day39_tasks.device;

public class Tv extends Device{
    public Tv(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void channelUp(){};

    public void channelDown(){};
}
/*
4. Create a sub class of Device named TV:

				Extra Methods:
					channelUp()
					channelDown()
 */