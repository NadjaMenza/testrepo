package second_problem;

public class Bookshelf {
    private int numberShelf;
    private int numberBook;

    public int getNumberShelf() {
        return numberShelf;
    }

    public void setNumberShelf(int numberShelf) {
        this.numberShelf = numberShelf;
    }

    public int getNumberBook() {
        return numberBook;
    }

    public void setNumberBook(int numberBook) {
        this.numberBook = numberBook;
    }

    public Bookshelf (){
            numberShelf = 5;
            numberBook = 0;
    }
    public Bookshelf (int a){
        this.numberShelf = a;
        this.numberBook = 0;
    }
    public Bookshelf (int a, int b){
        this.numberShelf = a;
        this.numberBook = b;
    }
    public void addBookToShelf (int a){
        this.numberBook += a;
    }
    public void setBook (int b){
        this.numberBook = b;
    }


}
