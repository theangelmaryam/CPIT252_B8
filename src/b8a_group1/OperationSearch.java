package b8a_group1;

public class OperationSearch implements Strategy {

    @Override
    public Book doOperation(String bookTitle, String bookAuthor, int bookYear, double bookPrice) {
        Book book = null;
        for (int i = 0; i < Book.bookList.size(); i++) {
            if (bookTitle.equalsIgnoreCase(Book.bookList.get(i).title)) {
                book = Book.bookList.get(i);
            }
        }
        return book;
    }

}
