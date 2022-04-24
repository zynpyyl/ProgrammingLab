package day39_tasks.animal;

public class FriendlyAnimal extends Animal{

    private boolean isPlayable;
    public static boolean isWild=false;
    public static boolean isFriendly=false;

    public FriendlyAnimal(String name, String breed, String size, String color, char gender, int age, boolean isPlayable) {
        super(name, breed, size, color, gender, age);
        this.isPlayable = isPlayable;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void play(){};

    public void pet(){};

}

/*
2. Create a subclass of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */