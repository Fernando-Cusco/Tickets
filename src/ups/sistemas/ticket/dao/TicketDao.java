package ups.sistemas.ticket.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import ups.sistemas.ticket.EN.Ticket;
import ups.sistemas.ticket.EN.Vehiculo;

/**
 *
 * @author fernandocuscomejia
 */
public class TicketDao {

    private Conexion con;

    public boolean insert(Ticket t) {
        boolean inserted = false;
        con = new Conexion();
        PreparedStatement statement = null;
        try {
            String sql = "insert into tickets(vehiculo_id, fecha, hora_ingreso, estado) values(?, ?, ?, ?);";
            statement = con.connect().prepareStatement(sql);
            statement.setInt(1, t.getUnVehiculo().getId());
            statement.setString(2, t.getFecha().toString());
            statement.setString(3, t.getHoraIngreso().toString());
            statement.setInt(4, t.getEstado());
            inserted = statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                con.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return inserted;
    }

    public boolean edit(Ticket t, int numero) {
        boolean edited = false;
        con = new Conexion();
        PreparedStatement statement = null;
        try {
            String sql = "update tickets set vehiculo_id = ? where id = ?;";
            statement = con.connect().prepareStatement(sql);
            statement.setInt(1, t.getUnVehiculo().getId());
            edited = statement.execute();
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
        return edited;
    }

    public ArrayList<Ticket> getTicketsPagados(int estado) {
        ArrayList<Ticket> tickets = new ArrayList<>();
        con = new Conexion();
        Statement statement = null;
        ResultSet result = null;
        int cont =0;
        try {
            String sql = "select vehiculo_id, fecha, hora_ingreso, hora_salida, estado, tiempo, valor from tickets where estado ="+estado+";";
            statement = con.connect().createStatement();
            result = statement.executeQuery(sql);
            while (result.next()) {
                Ticket t = new Ticket();
                Vehiculo v = new Vehiculo();
                v.setId(cont++);
                t.setUnVehiculo(v);
                //Date d = new SimpleDateFormat("dd/MM/yyyy").parse(result.getString(2));
                t.setFecha(result.getString(2));
                t.setHoraIngreso(result.getString(3));
                t.setHoraSalida(result.getString(4));
                t.setEstado(result.getInt(5));
                t.setTiempo(result.getString(6));
                t.setValor(result.getFloat(7));
                tickets.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } //catch (ParseException p) {
            //p.printStackTrace();
        //} 
        finally {
            try {
                result.close();
                statement.close();
                con.closeConnection();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return tickets;
    }

    public int ultimoNumero() {
        Statement statement = null;
        ResultSet result = null;
        con = new Conexion();
        int numero = 0;
        try {
            String sql = "select max(id) from tickets;";
            statement = con.connect().createStatement();
            result = statement.executeQuery(sql);
            while (result.next()) {
                numero = result.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                result.close();
                statement.close();
                con.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        numero = numero + 1;
        return numero;
    }

    public Ticket buscarTicket(int numeroTicket) {
        VehiculoDao vd = new VehiculoDao();
        PreparedStatement statement = null;
        ResultSet result = null;
        Ticket tck = new Ticket();
        con = new Conexion();
        Vehiculo v = null;
        try {
            String sql = "select id, vehiculo_id, fecha, hora_ingreso, estado from tickets where id = ?;";
            statement = con.connect().prepareStatement(sql);
            statement.setInt(1, numeroTicket);
            result = statement.executeQuery();
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
        } finally {
            try {
                result.close();
                statement.close();
                con.closeConnection();
            } catch (Exception e) {
            }
        }
        return tck;
    }

    public boolean estadoTicketVehiculo(int idVehiculo) {
        boolean isOpen = false;
        int est = 2;
        con = new Conexion();
        Statement statement = null;
        ResultSet result = null;
        try {
            String sql = "SELECT estado FROM tickets WHERE vehiculo_id = " + idVehiculo + " and estado = 0;";
            statement = con.connect().createStatement();
            result = statement.executeQuery(sql);
            while (result.next()) {
                est = result.getInt(1);
            }
            if (est == 0) {
                isOpen = true;
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
        return isOpen;
    }

    public boolean pagarValorTicket(Ticket t) {
        boolean payed = false;
        con = new Conexion();
        PreparedStatement statement = null;
        try {
            String sql = "update tickets set hora_salida = ?, estado = ?, tiempo = ?, valor = ? where id = ?";
            statement = con.connect().prepareStatement(sql);
            statement.setString(1, t.getHoraSalida());
            statement.setInt(2, t.getEstado());
            statement.setString(3, t.getTiempo());
            statement.setFloat(4, t.getValor());
            statement.setInt(5, t.getId());
            int c = statement.executeUpdate();
            if (c == 1) {
                payed = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                con.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return payed;
    }
}
