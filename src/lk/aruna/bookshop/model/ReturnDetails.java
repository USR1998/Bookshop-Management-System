
package lk.aruna.bookshop.model;

public class ReturnDetails {
    String rorder_ID;
    String rcustomer_ID;
    String return_date;
    String book_ID;
    String book_name;

    public ReturnDetails() {
    }

    public ReturnDetails(String rorder_ID, String rcustomer_ID, String return_date, String book_ID, String book_name) {
        this.rorder_ID = rorder_ID;
        this.rcustomer_ID = rcustomer_ID;
        this.return_date = return_date;
        this.book_ID = book_ID;
        this.book_name = book_name;
    }

   
    
    public String getRorder_ID() {
        return rorder_ID;
    }

    public void setRorder_ID(String rorder_ID) {
        this.rorder_ID = rorder_ID;
    }

    public String getRcustomer_ID() {
        return rcustomer_ID;
    }

    public void setRcustomer_ID(String rcustomer_ID) {
        this.rcustomer_ID = rcustomer_ID;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
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

    @Override
    public String toString() {
        return "ReturnDetails{" + "rorder_ID=" + rorder_ID + ", rcustomer_ID=" + rcustomer_ID + ", return_date=" + return_date + ", book_ID=" + book_ID + ", book_name=" + book_name + '}';
    }

   
   
    
    
    
}
   