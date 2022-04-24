package day39_tasks.animal;

public class WildAnimal extends Animal{

    public static boolean isWild=true;
    public static boolean isFriendly=false;
    public static boolean isPlayable=false;

    public WildAnimal(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void hunt(){};
}

/*
3. Create a subclass of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()
 */
