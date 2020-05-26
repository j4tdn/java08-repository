package java08.ex05;

public class ViewBook {
    private static final String NAME_PUBLISHER = "Nhi Dong";

    public static void main(String[] args) {
        Book[] books = mockData();
        System.out.println("There are books: ");
        findBooksByPublisher(books, NAME_PUBLISHER);
        System.out.println("=====================");

        System.out.println("There are books having price: ");
        findBooksHavePrice(books, 50);

        System.out.println("=====================");
        findReferenceBooksHavePrice(books);

    }

    private static Book[] mockData() {
        TextBook textBook1 = new TextBook("SGK1", 20, "Nhi Dong", StatusBook.OLD);
        TextBook textBook2 = new TextBook("SGK2", 40, "Xuan Mai", StatusBook.NEW);
        TextBook textBook3 = new TextBook("SGK3", 100, "Nhi Dong", StatusBook.NEW);

        ReferenceBook referenceBook1 = new ReferenceBook("STK1", 100, "Xuan", 0.05);
        ReferenceBook referenceBook2 = new ReferenceBook("STK2", 130, "Nhi Dong", 0.07);
        ReferenceBook referenceBook3 = new ReferenceBook("STK3", 120, "Xuan", 0.1);

        Book[] books = {textBook1, textBook2, textBook3, referenceBook1, referenceBook2, referenceBook3};
        return books;
    }

    private static void findBooksByPublisher(Book[] books, String namePublisher) {
        for (Book book : books) {
            if (book.getPublisher().equals(namePublisher)) {
                System.out.println(book);
            }
        }
    }

    private static void findBooksHavePrice(Book[] books, double priceRequest){
        for(Book book: books){
            if(book.getPice() < 50){
                System.out.println(book);
            }
        }
    }

    private static void findReferenceBooksHavePrice(Book[] books){
        for(Book book: books){
            if(book.getId().substring(0,3).equals("SGK") && book.getPice() >= 100 && book.getPice() <= 200){
                System.out.println(book);
            }
        }
    }

}
