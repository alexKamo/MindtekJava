package constructors;

public class Library {

    public static void main(String[] args) {

        Book book1 = new Book("OCA",500,"James Boyarsky");
        Book book2 = new Book("10x Rules", 100, "Grand Gardone");
        Book book3 = new Book("War & Peace");
        Book book4 = new Book(250);
        Book book5 = new Book();

        Book[] books={book1,book2,book3,book4,book5};
        int totalPages = 0;
        for (Book b : books){
            if (b.pages>200) System.out.println(b.title);
            //Print author that has book title as null
            if (b.title==null) System.out.println(b.author);
            //Print total pages for all books that has title
            if (b.title!=null) totalPages+=b.pages;
        }
        System.out.println("Total pages: " +totalPages);
    }

}
