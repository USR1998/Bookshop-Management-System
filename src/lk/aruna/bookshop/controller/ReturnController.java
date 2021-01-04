

package lk.aruna.bookshop.controller;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.aruna.bookshop.db.DBConnection;
import lk.aruna.bookshop.model.ReturnDetails;


public class ReturnController {

    public static boolean saveReturns(ReturnDetails r1) throws SQLException {
         Connection connection=null;
        try {
            connection = DBConnection.getInstance().getConnection();
            connection.setAutoCommit(false);
            
            PreparedStatement stm = connection.prepareStatement("INSERT INTO Returns_Details VALUES(?,?,?,?,?)");
            stm.setObject(1, r1.getRorder_ID());
            stm.setObject(2, r1.getRcustomer_ID());
            stm.setObject(3, r1.getReturn_date());
            stm.setObject(4, r1.getBook_ID());
            stm.setObject(5, r1.getBook_name());           
            
            boolean isSaved = stm.executeUpdate()>0;
            
            if(isSaved){
            connection.commit();
            return true;
            
            }else{
            connection.rollback();
            return false;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReturnController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        connection.setAutoCommit(true);
        }
        return false;
    }
    

     
    
    public List<ReturnDetails> getAllReturns() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("SELECT * FROM Returns_Details").executeQuery();
        List<ReturnDetails> templist = new ArrayList<>();
        while (rst.next()){
        templist.add(new ReturnDetails(
               rst.getString(1),
               rst.getString(2),
               rst.getString(3),
               rst.getString(4),
               rst.getString(5))
               );
        }
        return templist;
    }

      
      

   

  

   


    
}
