package Book.book;

public class Book {
    String bookName;
    String bookAutrer;
    int bookPages;
    Boolean bookDocument;

    public Book(String bookName, String bookAutrer, int bookPages, Boolean bookDocument) {
        this.bookName = bookName;
        this.bookAutrer = bookAutrer;
        this.bookPages = bookPages;
        this.bookDocument = bookDocument;
    }

    public void setBookName(){
    System.out.println(bookPages);
    }
    public void setLines(int lines){
        System.out.println(bookPages * lines);
    }
   public void result(){
        System.out.printf("%s от %s - %s",bookName,bookAutrer, bookDocument ? "документальный" : "не документальный");
   }
}
