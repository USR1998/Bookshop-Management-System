
package lk.aruna.bookshop.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import lk.aruna.bookshop.db.DBConnection;
import lk.aruna.bookshop.model.ItemDetails;
import lk.aruna.bookshop.model.OrderDetails;
import lk.aruna.bookshop.model.Orders;



public class OrderController {

    public static String generateOID() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT order_ID  FROM orders ORDER BY order_ID  DESC LIMIT 1";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet rst = pstm.executeQuery();
        
        if(rst.next()){
            return rst.getString(1);
        }
        return null;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static String generateCID() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql ="SELECT customer_ID   FROM orders ORDER BY customer_ID   DESC LIMIT 1";
         PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet rst = pstm.executeQuery();
        
        if(rst.next()){
            return rst.getString(1);
        }
        return null;
    }

//////////////////////////////////////////////////////////////////////////////////////////////
    
    public static boolean saveOrder(Orders order) throws ClassNotFoundException, SQLException {
        PreparedStatement STM = DBConnection.getInstance().getConnection().prepareStatement("INSERT INTO orders VALUES(?,?,?,?)");
        try{
        DBConnection.getInstance().getConnection().setAutoCommit(false);
        
        STM.setObject(1, order.getOrder_ID());
        STM.setObject(2, order.getCustomer_ID());
        STM.setObject(3, order.getOdate());
        STM.setObject(4, order.getTotal());
        boolean orderAdded = STM.executeUpdate()> 0;
        if(orderAdded){
            boolean addItemDetails = ItemDetailController.addItemDetails(order.getItemDetaiList());
            if(addItemDetails){
                boolean updateBookStock = ItemDetailController.updateStock(order.getItemDetaiList());
                if(updateBookStock){
                DBConnection.getInstance().getConnection().commit();
                return true;
                }
            }
        }
        DBConnection.getInstance().getConnection().rollback();
        return false;
        }finally{
            DBConnection.getInstance().getConnection().setAutoCommit(true);
        }
    }

    public static Orders getDetails(String oid) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement cstm = connection.createStatement();
        String SQL = "SELECT * FROM orders WHERE order_ID ='"+oid+"'";
        ResultSet rst = cstm.executeQuery(SQL);
        if(rst.next()){
        return new Orders(rst.getString("order_ID"), rst.getString("customer_ID"), rst.getString("odate"), rst.getDouble("total"));
        }
        return null;
    }



    public List<OrderDetails> getAllOrders() throws ClassNotFoundException, SQLException {
        
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("SELECT * FROM orders").executeQuery();
        List<OrderDetails> aa = new ArrayList<>();
        while(rst.next()){
            aa.add(new OrderDetails(
                  rst.getString(1), 
                  rst.getString(2), 
                  rst.getString(3),
                  rst.getDouble(4)));
        
       
        }
        return aa;
    }

    public List<ItemDetails> searchOrders(String oid) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("SELECT * FROM Item_Details WHERE order_ID ='"+oid+"'").executeQuery();
        List<ItemDetails> tempList = new ArrayList<>();
        while(rst.next()){
            tempList.add(new ItemDetails(
                    rst.getString(1), 
                    rst.getString(2), 
                    rst.getString(3), 
                    rst.getInt(4), 
                    rst.getDouble(5)));
        }
        return tempList;
    }

 

   



    

}

