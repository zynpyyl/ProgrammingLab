package day36_tasks.book;

public class Book {

    public String title,type,author;
    public double price;

    public void setInfo(String title, String type, String author, double price) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}


/*
3.1. create a class named Book:
			variables:
				title, type, author, price

			Methods:
				setInfo()
				toString()
 */