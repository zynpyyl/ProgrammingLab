package day31_tasks;

import java.util.ArrayList;

public class MovieObjects {

    public static void main(String[] args) {

    Movie movie =new Movie("USA","Journey to SDET: Cydeo Batch 25","10/25/2021","Kuzzat Atay");
    movie.genre="Adventure, Comedy, Thriller";
    String[] casts={"Asiya","Adam","Muhtar","Zeynep","Beyzanur","Azra","Irfan","Burhan"};
    movie.addCast(casts);
    System.out.println(movie);


}
}
