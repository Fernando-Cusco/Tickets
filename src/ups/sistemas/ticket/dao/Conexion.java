package ups.sistemas.ticket.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fernandocuscomejia
 */
public class Conexion {
    
    private Connection connection = null;
    
    public Connection connect(){
        String url = "jdbc:mysql://localhost:3306/tickets";
        String user = "root";
        String pass = "cuenca";
        try {
            connection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    
    public void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
