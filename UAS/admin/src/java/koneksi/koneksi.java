/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jdbc;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Praktek
 */
public class koneksi {
    public Connection bukaKoneksi()throws SQLException
    {
        Connection connect;
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connect = (Connection) DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/db_uas", "root", "");
            return connect;
        }
        catch(Exception ex)
        {
        }
        return null;
    }
}
