package day36_tasks.book;

public class BookObjects {
    public static void main(String[] args) {

        Book book=new Book();
        book.setInfo("Masumiyet Muzesi","Novel","Orhan Pamuk",75);
        System.out.println(book);

        Ebook ebook=new Ebook();
        ebook.setInfo("Anna Karenina","Novel","Tolstoy",150,"small",1000);
        ebook.readBook();
        System.out.println(ebook);

        AudioBook audioBook=new AudioBook();
        audioBook.setInfo("Ince Memed","Novel","Yasar Kemal",350,3.5,"Mert Firat");
        audioBook.listen();
        System.out.println(audioBook);

    }
}
