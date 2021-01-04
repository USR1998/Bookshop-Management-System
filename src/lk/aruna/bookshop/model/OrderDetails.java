
package lk.aruna.bookshop.model;


public class OrderDetails {
    String order_ID;
    String customer_ID;
    String odate;
    double total;

    public OrderDetails() {
    }

    public OrderDetails(String order_ID, String customer_ID, String odate, double total) {
        this.order_ID = order_ID;
        this.customer_ID = customer_ID;
        this.odate = odate;
        this.total = total;
    }

    public String getOrder_ID() {
        return order_ID;
    }

    public void setOrder_ID(String order_ID) {
        this.order_ID = order_ID;
    }

    public String getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(String customer_ID) {
        this.customer_ID = customer_ID;
    }

    public String getOdate() {
        return odate;
    }

    public void setOdate(String odate) {
        this.odate = odate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrderDetails{" + "order_ID=" + order_ID + ", customer_ID=" + customer_ID + ", odate=" + odate + ", total=" + total + '}';
    }
    
    
    
}
