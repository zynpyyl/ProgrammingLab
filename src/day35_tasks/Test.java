package day35_tasks;


public class Test {
    public static void main(String[] args) {
        Circle circle=new Circle(2.5);
        System.out.println(circle);
        Circle circle1=new Circle(-3);
        System.out.println(circle1);

        System.out.println("------------------");

        Square square=new Square(4);
        System.out.println(square.getSide());
        System.out.println(square);
        square.setSide(-5);
        System.out.println(square);
        Square square1=new Square(-5);
        System.out.println(square1);

        System.out.println("------------------");

        Rectangle rectangle=new Rectangle(2.5,3.5);
        Rectangle rectangle1=new Rectangle(-3,4);
        System.out.println(rectangle);
        System.out.println(rectangle1);

        System.out.println("------------------");

        Carpet carpet=new Carpet(80,100,20,true);
        Carpet carpet1=new Carpet(50,100,40,false);
        Carpet carpet2=new Carpet(-20,40,100,true);
        System.out.println(carpet);
        System.out.println(carpet1);
        System.out.println(carpet2);

        System.out.println("------------------");

    }
}
