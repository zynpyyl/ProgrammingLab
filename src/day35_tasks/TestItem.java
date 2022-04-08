package day35_tasks;

public class TestItem {
    public static void main(String[] args) {

        Item item1=new Item("Domatoe",3,2);
        Item item2=new Item("8Potatoe",3,2);
        Item item3=new Item("P otatoe",3,2);
        Item item4=new Item("Po&tatoe",3,2);
        Item item5=new Item("Po8tatoe",3,2);
        Item item6=new Item("Potatoe",-3,2);
        Item item7=new Item("Potatoe",-3,-2);
        Item item8=new Item("Toilet Paper",3,4);
        Item item9=new Item("",300,2);



    System.out.println("item1 = " + item1);
    System.out.println("item2 = " + item2);
    System.out.println("item3 = " + item3);
    System.out.println("item4 = " + item4);
    System.out.println("item5 = " + item5);
    System.out.println("item6 = " + item6);
    System.out.println("item7 = " + item7);
    System.out.println("item8 = " + item8);
    System.out.println("item9 = " + item9);

    }
}
