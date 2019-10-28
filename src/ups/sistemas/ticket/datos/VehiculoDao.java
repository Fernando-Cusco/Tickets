package ups.sistemas.ticket.datos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ups.sistemas.ticket.negocio.Vehiculo;
/**
 *
 * @author fernandocuscomejia
 */
public class VehiculoDao {
    
    private Conexion con;
    
    public boolean insert(Vehiculo v){
        boolean fila = false;
        PreparedStatement statement = null;
        con = new Conexion();
        try {
            String sql = "insert into vehiculos (placa, marca) values(?, ?);";
            statement = con.connect().prepareStatement(sql);
            statement.setString(1, v.getPlaca());
            statement.setString(2, v.getMarca());
            int c = statement.executeUpdate();
            if(c == 1){
                fila = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                con.closeConnection();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return fila;
    }
    
    public boolean edit(Vehiculo v, String placa){
        boolean updated = false;
        PreparedStatement statement = null;
        con = new Conexion();
        try {
            String sql = "update vehiculos set placa = ?, marca = ? where placa = ?;"; 
            statement = con.connect().prepareStatement(sql);
            statement.setString(1, v.getPlaca());
            statement.setString(2, v.getMarca());
            updated = statement.execute();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                con.closeConnection();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return updated;
    }
    
    public boolean delete(String placa){
        boolean deleted = false;
        con = new Conexion();
        PreparedStatement statement = null;
        try {
            String sql = "delete from vehiculos where placa = ?";
            statement = con.connect().prepareStatement(sql);
            statement.setString(1, placa);
            deleted = statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                con.closeConnection();
            } catch (Exception e) {
            }
        }
        return deleted;
    }
    
    public Vehiculo read(int id){
        Vehiculo v = new Vehiculo();
        con = new Conexion();
        PreparedStatement statement = null;
        ResultSet result= null;
        try {
            String sql = "select placa, marca, id from vehiculos where id = ?;";
            statement = con.connect().prepareStatement(sql);
            statement.setInt(1, id);
            result = statement.executeQuery();
            while(result.next()){
                v.setMarca(result.getString(1));
                v.setPlaca(result.getString(2));
                v.setId(result.getInt(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                result.close();
                statement.close();
                con.closeConnection();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return v;
    }
    

    public Vehiculo buscarByPlaca(String placa){
        Vehiculo v = new Vehiculo();
        ResultSet result = null;
        PreparedStatement statement = null;
        con = new Conexion();
        System.out.println("PLACA: "+placa);
        try {
            String sql = "select placa, marca, id from vehiculos where placa = ?";
            statement = con.connect().prepareStatement(sql);
            statement.setString(1, placa);
            result = statement.executeQuery();
            while (result.next()) {                
                v.setPlaca(result.getString(1));
                v.setMarca(result.getString(2));
                v.setId(result.getInt(3));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally{
            try {
                result.close();
                statement.close();
                con.connect();
            } catch (SQLException ex) {
                Logger.getLogger(VehiculoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return v;
    }
}