package second_problem;

public class Main {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf(2, 10);
        bookshelf.addBookToShelf(5);
        bookshelf.setNumberBook(2);

        System.out.println(bookshelf.getNumberBook());
        System.out.println(bookshelf.getNumberShelf());


    }
}
