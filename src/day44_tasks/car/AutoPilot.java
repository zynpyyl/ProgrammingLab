package day44_tasks.car;

public interface AutoPilot extends AutoPark {

    boolean hasAutoPilot=true;

    void selfDrive();

}


/*
	3. Create a child interface of AutoPark named AutoPilot
				Variables:
					hasAutoPilot

				Abstract method:
					selfDrive();
 */