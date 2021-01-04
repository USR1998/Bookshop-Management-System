
package lk.aruna.bookshop.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.aruna.bookshop.db.DBConnection;
import lk.aruna.bookshop.model.ItemDetails;

public class ItemDetailController {

    static boolean addItemDetails(ArrayList<ItemDetails> itemDetaiList) throws ClassNotFoundException, SQLException {
        for(ItemDetails itemdetail:itemDetaiList){
        boolean isadded = ItemDetailController.saveItemDetails(itemdetail);
        if(!isadded){
            return false;
        }
        }
        return true;
    }

    private static boolean saveItemDetails(ItemDetails itemdetail) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement STM = connection.prepareStatement("INSERT INTO Item_Details VALUES(?,?,?,?,?)");
        STM.setObject(1, itemdetail.getOrder_ID());
        STM.setObject(2, itemdetail.getBook_ID());
        STM.setObject(3, itemdetail.getBook_name());
        STM.setObject(4, itemdetail.getQty());
        STM.setObject(5, itemdetail.getUnit_price());
        return STM.executeUpdate()>0;
    }

    static boolean updateStock(ArrayList<ItemDetails> itemDetaiList) throws ClassNotFoundException, SQLException {
        for(ItemDetails itemdetail:itemDetaiList){
        boolean isupdate = ItemDetailController.updateBookStock(itemdetail);
        if(!isupdate){
            return false;
        }
        }
        return true;
    }

    private static boolean updateBookStock(ItemDetails itemdetail) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement STM = connection.prepareStatement("Update Book_Details set availability=availability -? where book_ID =?");
        STM.setObject(1, itemdetail.getQty());
        STM.setObject(2, itemdetail.getBook_ID());
        return STM.executeUpdate()>0;
    }
    
}
