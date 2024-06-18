public class Book {
    public String isbn;
    public String title;

    public Book(){

    }

    public Book(String isbn, String title){
        this.title = title;
        this.isbn = isbn;
    }

    public String toString(){
        return "ISBN: " + this.isbn + " Title: " + this.title;
    }
}
