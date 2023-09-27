
package th_lab3;


public class TestBook {
    public static void main(String[] args) {
        Author anAuthor = new Author ("Tan Ah Teck","ahteck@somewhere.com", 'm');
        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
        Book anotherBook = new Book("more Java for dummy", new Author("Tan Ah Teck1","ahteck1@somewhere.com", 'f'), 29.95, 888);
        
        System.out.println("Ten tac gia: "+ aBook.getAuthor().getName());
        System.out.println("Email cua tac gia: "+ aBook.getAuthor().getEmail());
        
        System.out.println("Ten tac gia: "+anotherBook.getAuthorName());
        System.out.println("Email tac gia: "+anotherBook.getAuthorEmail());
    }
}
