package ups.sistemas.ticket.datos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import ups.sistemas.ticket.negocio.Ticket;
import ups.sistemas.ticket.negocio.Vehiculo;

/**
 *
 * @author fernandocuscomejia
 */
public class TicketDao {
    private Conexion con;
    
    public boolean insert(Ticket t){
        boolean inserted = false;
        con = new Conexion();
        try {
            String sql = "insert into tickets(vehiculo_id, fecha, hora_ingreso, estado) values(?, ?, ?, ?);";
            PreparedStatement statement = con.connect().prepareStatement(sql);
            statement.setInt(1, t.getUnVehiculo().getId());
            statement.setString(2, t.getFecha().toString());
            statement.setString(3, t.getHoraIngreso().toString());
            statement.setInt(4, t.getEstado());
            inserted = statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return inserted;
    }
    
    public boolean edit(Ticket t, int numero){
        boolean edited = false;
        con = new Conexion();
        try {
            String sql = "update tickets set vehiculo_id = ? where id = ?;";
            PreparedStatement statement = con.connect().prepareStatement(sql);
            statement.setInt(1, t.getUnVehiculo().getId());
            edited = statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return edited;
    }
    
    public ArrayList<Ticket> getTicketsPagados(int estado){
        ArrayList<Ticket> tickets = new ArrayList<Ticket>();
        con = new Conexion();
        try {
            String sql = "select vehiculo_id, fecha, hora_ingreso, hora_salida, estado, tiempo, valor from tickets where estado = 0;";
            Statement statement = con.connect().createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {                
                Ticket t = new Ticket();
                Vehiculo v = new Vehiculo();
                v.setId(result.getInt(1));
                t.setUnVehiculo(v);
                Date d = new SimpleDateFormat("dd/MM/yyyy").parse(result.getString(2));
                t.setFecha(d.toString());
                t.setHoraIngreso(result.getString(3));
                t.setHoraSalida(result.getString(4));
                t.setEstado(result.getInt(5));
                t.setTiempo(result.getString(6));
                t.setValor(result.getFloat(7));
                tickets.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException p){
            p.printStackTrace();
        }
        
        return tickets;
    }
    
    public int ultimoNumero(){
        con = new Conexion();
        int numero = 0;
        try {
            String sql = "select max(id) from tickets;";
            Statement statement = con.connect().createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()){
                numero = result.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        numero = numero + 1;
        return numero;
    }
    
    public Ticket buscarTicket(int numeroTicket){
        VehiculoDao vd = new VehiculoDao();
        Ticket tck = new Ticket();
        con = new Conexion();
        Vehiculo v = null;
        try {
            String sql = "select id, vehiculo_id, fecha, hora_ingreso, estado from tickets where id = "+numeroTicket+";";
            Statement statement = con.connect().createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {                
                tck.setId(result.getInt(1));
                v = vd.read(result.getInt(2));
                tck.setUnVehiculo(v);
                tck.setFecha(result.getString(3));
                tck.setHoraIngreso(result.getString(4));
                tck.setEstado(result.getInt(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tck;
    } 
    
    public boolean estadoTicketVehiculo(int idVehiculo){
        boolean isOpen = false;
        int est = 2;
        con = new Conexion();
        try {
            String sql = "SELECT estado FROM tickets WHERE vehiculo_id = "+idVehiculo+" and estado = 0;";
            Statement statement = con.connect().createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()){
                est = result.getInt(1);
            }
            if(est == 0){
                isOpen = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isOpen;
    }
    
    public boolean pagarValorTicket(Ticket t){
        boolean payed = false;
        con = new Conexion();
        try {
            String sql = "update tickets set hora_salida = ?, estado = ?, tiempo = ?, valor = ? where id = ?";
            PreparedStatement statement = con.connect().prepareStatement(sql);
            statement.setString(1, t.getHoraSalida());
            statement.setInt(2, t.getEstado());
            statement.setString(3, t.getTiempo());
            statement.setFloat(4, t.getValor());
            statement.setInt(5, t.getId());
            int c = statement.executeUpdate();
            if(c == 1){
                payed = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return payed;
    }   
}