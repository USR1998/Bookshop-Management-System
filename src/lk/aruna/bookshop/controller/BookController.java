
package lk.aruna.bookshop.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lk.aruna.bookshop.db.DBConnection;
import lk.aruna.bookshop.model.BookDetails;
import lk.aruna.bookshop.views.Book_Details;

public class BookController {

    public static BookDetails searchBook(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement cstm = connection.createStatement();
        String SQL = "SELECT * FROM Book_Details WHERE book_ID ='"+id+"'";
        ResultSet rst = cstm.executeQuery(SQL);
        if(rst.next()){
            return new BookDetails(rst.getString("book_ID"),rst.getString("book_name"),rst.getString("publisher"),rst.getDouble("price"),rst.getString("category"),rst.getInt("availability"));
        }
        return null;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static boolean updateBookDetails(BookDetails bookdetails) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("UPDATE Book_Details SET book_name =?, publisher =?, price =?, category=?, availability =? where book_ID =?");
        pstm.setObject(1, bookdetails.getBook_name());
        pstm.setObject(2, bookdetails.getPublisher());
        pstm.setObject(3, bookdetails.getPrice());
        pstm.setObject(4, bookdetails.getCategory());
        pstm.setObject(5, bookdetails.getAvailability());
        pstm.setObject(6, bookdetails.getBook_ID());
        return pstm.executeUpdate()>0;
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static boolean DeleteBook(String bookId) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("DELETE * FROM Book_Details WHERE book_ID =?");
        pstm.setString(0, bookId);
        return pstm.executeUpdate()>0;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static BookDetails searchInfo(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement cstm = connection.createStatement();
        String SQL = "SELECT * FROM Book_Details WHERE book_ID ='"+id+"'";
        ResultSet rst = cstm.executeQuery(SQL);
        if(rst.next()){
            return new BookDetails(rst.getString("book_ID"),rst.getString("book_name"),rst.getString("publisher"),rst.getDouble("price"),rst.getString("category"),rst.getInt("availability"));
        }
        return null;
    }

      
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public List<BookDetails> getAllBooks() throws ClassNotFoundException, SQLException {
        Connection con = DBConnection.getInstance().getConnection();
        ResultSet rst = con.prepareStatement("SELECT * FROM Book_Details").executeQuery();
        List<BookDetails> tempList = new ArrayList<>();
        while(rst.next()){
        tempList.add(new BookDetails(
                rst.getString(1),
                rst.getString(2),
                rst.getString(3), 
                rst.getDouble(4),
                rst.getString(5),
                rst.getInt(6)) 
               
        );
        }
        return tempList;
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////

    public Boolean Addbook(BookDetails bookDetails) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Book_Details VALUES(?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, bookDetails.getBook_ID());
        pstm.setObject(2, bookDetails.getBook_name());
        pstm.setObject(3, bookDetails.getPublisher());
        pstm.setObject(4, bookDetails.getPrice());
        pstm.setObject(5, bookDetails.getCategory());
        pstm.setObject(6, bookDetails.getAvailability());
        return pstm.executeUpdate()>0;
    }

    

  
    
}
