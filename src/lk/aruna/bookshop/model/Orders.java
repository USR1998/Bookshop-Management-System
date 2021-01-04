
package lk.aruna.bookshop.model;

import java.util.ArrayList;

public class Orders {
    String order_ID;
    String customer_ID;
    String odate;
    double total;
    ArrayList<ItemDetails>itemDetaiList;

    public Orders() {
    }

    public Orders(String order_ID, String customer_ID, String odate,double total, ArrayList<ItemDetails> itemDetaiList) {
        this.order_ID = order_ID;
        this.customer_ID = customer_ID;
        this.odate = odate;
        this.total = total;
        this.itemDetaiList = itemDetaiList;
    }

    public Orders(String order_ID, String customer_ID, String odate, double total) {
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
    

    public ArrayList<ItemDetails> getItemDetaiList() {
        return itemDetaiList;
    }

    public void setItemDetaiList(ArrayList<ItemDetails> itemDetaiList) {
        this.itemDetaiList = itemDetaiList;
    }

    @Override
    public String toString() {
        return "Orders{" + "order_ID=" + order_ID + ", customer_ID=" + customer_ID + ", odate=" + odate + ", total=" + total + ", itemDetaiList=" + itemDetaiList + '}';
    }
    

  
    
    
}
