package day35_tasks;

public class Pizza {
    private String size;
    private int numberOfCheeseToppings, numberOfPepperoniToppings;

    public Pizza(String size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        setSize(size);
        setNumberOfCheeseToppings(numberOfCheeseToppings);
        setNumberOfPepperoniToppings(numberOfPepperoniToppings);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(!(size.equalsIgnoreCase("small")||size.equalsIgnoreCase("medium")||size.equalsIgnoreCase("large")))
            return;
        this.size = size;
    }

    public int getNumberOfCheeseToppings() {
        return numberOfCheeseToppings;
    }

    public void setNumberOfCheeseToppings(int numberOfCheeseToppings) {
        if(size==null||numberOfCheeseToppings<0||(size.equalsIgnoreCase("small")&&numberOfCheeseToppings > 3)||
                (size.equalsIgnoreCase("medium")&&numberOfCheeseToppings > 4) ||
                (size.equalsIgnoreCase("large")&&numberOfCheeseToppings > 5))
            return;
        this.numberOfCheeseToppings = numberOfCheeseToppings;
    }
    
    public int getNumberOfPepperoniToppings() {
        return numberOfPepperoniToppings;
    }

    public void setNumberOfPepperoniToppings(int numberOfPepperoniToppings) {
        if(size==null||numberOfPepperoniToppings<0||(size.equalsIgnoreCase("small")&&numberOfPepperoniToppings > 4)||
                (size.equalsIgnoreCase("medium")&&numberOfPepperoniToppings > 5) ||
                (size.equalsIgnoreCase("large")&&numberOfPepperoniToppings > 6))
            return;
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }
    public double calcCost(){
        double cost=size==null? 0 : size.equalsIgnoreCase("small")? 10 :size.equalsIgnoreCase("medium")? 12 : 14;
        cost+=(numberOfCheeseToppings+numberOfPepperoniToppings)*2;
        return cost;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                ", cost=" + calcCost() +
                '}';
    }
}



/*
5. Pizza Task:
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive
							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5
							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:
										small: 4
										medium: 5
										large: 6
				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)
				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */