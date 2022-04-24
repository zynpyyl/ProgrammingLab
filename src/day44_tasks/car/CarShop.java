package day44_tasks.car;

public class CarShop {

    public static void main(String[] args) {



    Toyota toyota=new Toyota("Corolla",2021,850000,"White");
    Honda honda=new Honda("Jazz",2021,825000,"Black");
    Mercedes mercedes=new Mercedes("CLA200",2020,1500000,"White");
    Audi audi=new Audi("A8",2000,1000000,"Red");
    BMW bmw=new BMW("X5",1950,300000,"Black");
    Tesla tesla=new Tesla("ModelX",2022,3000000,"Gray");
    CydeoCar cydeoCar=new CydeoCar("A80",2022,5000000,"White");
    Nio nio=new Nio("et5",2022,9000000,"Blue");

    toyota.start();

}

}


/*
11. Create a class named CarShop:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes
 */