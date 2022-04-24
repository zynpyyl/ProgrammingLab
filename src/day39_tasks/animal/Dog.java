package day39_tasks.animal;

public class Dog extends FriendlyAnimal{

    public Dog(String name, String breed, String size, String color, char gender, int age, boolean isPlayable) {
        super(name, breed, size, color, gender, age, isPlayable);
    }

    public void bark(){};
}
/*
4. Create the following sub classes of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()

			2. Cat:
					Extra methods:
						scratch()
						meow()

			3. Dolphin:
					Extra methods:
						swim()

			4. Parrot:
					Extra methods:
						fly()
						sing()
 */