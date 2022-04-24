package day39_tasks.animal;

public class Bear extends WildAnimal{
    public Bear(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void hunt() {
        super.hunt();
    }
}
