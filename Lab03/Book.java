
package th_lab3;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock = 0;
    
    public Book(String name, Author author, double price){
        this.author = author;
        this.name = name;
        this.price = price;
    }
    
    public Book(String name, Author author, double price, int qtyInStock){
        this.author = author;
        this.name = name;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    
    public String getName(){
        return name;
    }
    
    public Author getAuthor(){
        return author;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public int getQtyInStock(){
        return qtyInStock;
    }
    
    public void setQtyInStock(int qtyInStock){
        this.qtyInStock = qtyInStock;
    }
    
    public String getAuthorName(){
        return this.getAuthor().getName();
    }
    
    public String getAuthorEmail(){
        return this.getAuthor().getEmail();
    }
    
    public char getAuthorGender(){
        return this.getAuthor().getGender();
    }
}
