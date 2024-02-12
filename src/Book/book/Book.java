package Book.book;

public class Book {
    String bookName = "Marten Idon";
    String bookAutrer = "Djeck London";
    int bookPages = 40;
    Boolean bookDocument = true;

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
