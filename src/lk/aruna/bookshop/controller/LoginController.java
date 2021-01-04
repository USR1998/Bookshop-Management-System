

package lk.aruna.bookshop.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import lk.aruna.bookshop.db.DBConnection;
import lk.aruna.bookshop.model.Employee;
import lk.aruna.bookshop.model.LoginInfo;

public class LoginController {

    public static boolean setNewPassword(LoginInfo loginInfo) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Signup VALUES(?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, loginInfo.getQ1());
        pstm.setObject(2, loginInfo.getQ2());
        pstm.setObject(3, loginInfo.getAnswer1());
        pstm.setObject(4, loginInfo.getAnswer2());
        pstm.setObject(5, loginInfo.getPassword());
        pstm.setObject(6, loginInfo.getRpassword());
        return pstm.executeUpdate()>0;
    }

    public static boolean saveEmployee(Employee e1) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Employee VALUES(?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, e1.getEnumber());
        pstm.setObject(2, e1.getName());
        pstm.setObject(3, e1.getAddress());
        pstm.setObject(4, e1.getTpnumber());
        return pstm.executeUpdate()>0;
    }

    public boolean applyToLogin(LoginInfo loginInfo) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Signup VALUES(?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, loginInfo.getEmployeeID());
        pstm.setObject(2, loginInfo.getEmplyeeName());
        pstm.setObject(3, loginInfo.getUsername());
        return pstm.executeUpdate()>0;
    }
    
}
