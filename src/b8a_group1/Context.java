package b8a_group1;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Book executeStrategy(String bookTitle, String bookAuthor, int bookYear, double bookPrice) {
        return strategy.doOperation(bookTitle, bookAuthor, bookYear, bookPrice);
    }

}
