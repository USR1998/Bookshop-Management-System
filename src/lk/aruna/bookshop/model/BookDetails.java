
package lk.aruna.bookshop.model;


public class BookDetails {
    String book_ID; 
    String book_name;
    String publisher; 
    double price;
    String category;
    int availability; 

    public BookDetails() {
    }

    public BookDetails(String book_ID, String book_name, String publisher, double price, String category, int availability) {
        this.book_ID = book_ID;
        this.book_name = book_name;
        this.publisher = publisher;
        this.price = price;
        this.category = category;
        this.availability = availability;
    }

    public String getBook_ID() {
        return book_ID;
    }

    public void setBook_ID(String book_ID) {
        this.book_ID = book_ID;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Book_Details{" + "book_ID=" + book_ID + ", book_name=" + book_name + ", publisher=" + publisher + ", price=" + price + ", category=" + category + ", availability=" + availability + '}';
    }
    
    
}
