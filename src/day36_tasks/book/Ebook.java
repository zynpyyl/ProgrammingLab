package day36_tasks.book;

public class Ebook extends Book {
    public String size;
    public int pages;

    public void setInfo(String title, String type, String author, double price,String size,int pages) {
        setInfo(title, type, author, price);
        this.size=size;
        this.pages=pages;
    }

    public void readBook(){
        System.out.println( title+" is being read");
    }


    public String toString() {
        return "Ebook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", pages=" + pages +
                '}';
    }
}



/*
3.2 Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()
 */