package day33_tasks;

public class TestPerson {

    public static void main(String[] args) {


    Person person1=new Person("Ceren",7,'F');
    Person person2=new Person("Pelin",8,'F');

    person1.eat("hamburger");
    person2.drink("icetea");

        System.out.println(person1);

        System.out.println(Person.hasNose);


    }
}

