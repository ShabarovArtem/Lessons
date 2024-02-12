package Book.book;

public class Runner {
    public static void main(String[] args) {
        Book ourbook = new Book("Martin Idon","D. London",40,false);
        ourbook.setBookName();
        ourbook.setLines(20);
        ourbook.result();
    }
}
