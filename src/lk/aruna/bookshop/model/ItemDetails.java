
package lk.aruna.bookshop.model;

public class ItemDetails {
    String order_ID;
    String book_ID;
    String book_name;
    int Qty;
    double unit_price; 

    public ItemDetails() {
    }

    public ItemDetails(String order_ID, String book_ID, String book_name, int Qty, double unit_price) {
        this.order_ID = order_ID;
        this.book_ID = book_ID;
        this.book_name = book_name;
        this.Qty = Qty;
        this.unit_price = unit_price;
    }

    public String getOrder_ID() {
        return order_ID;
    }

    public void setOrder_ID(String order_ID) {
        this.order_ID = order_ID;
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

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    @Override
    public String toString() {
        return "ItemDetails{" + "order_ID=" + order_ID + ", book_ID=" + book_ID + ", book_name=" + book_name + ", Qty=" + Qty + ", unit_price=" + unit_price + '}';
    }

    
    
}
