package day31_tasks.restaurant;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant vogue= new Restaurant("Ali Yazar","Istanbul",5);

        Server server1=new Server("Veli Bozar",1566,25,false);
        Server server2=new Server("Oya Gezer",1567,40,true);
        Chef chef1=new Chef("Hazer Amani",1568,40,true);
        Chef chef2=new Chef("Nusret Gokce",1588,40,true);

        Server[] servers={server1,server2};
        Chef[] chefs={chef1,chef2};
        vogue.hireServer(servers);
        vogue.hireChef(chefs);

        System.out.println(vogue);
    }
}
/*
6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */