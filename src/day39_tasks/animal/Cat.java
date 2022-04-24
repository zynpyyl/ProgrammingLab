package day39_tasks.animal;

public class Cat extends FriendlyAnimal{
    public Cat(String name, String breed, String size, String color, char gender, int age, boolean isPlayable) {
        super(name, breed, size, color, gender, age, isPlayable);
    }

    public void scratch(){};

    public void meow(){};

}
