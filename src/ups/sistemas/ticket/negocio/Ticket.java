package ups.sistemas.ticket.negocio;

/**
 *
 * @author fernandocuscomejia
 */
public class Ticket {
    private int id;
    private Vehiculo unVehiculo;
    private String fecha;
    private String horaIngreso;
    private String horaSalida;
    private int estado;
    private String tiempo;
    private float valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehiculo getUnVehiculo() {
        return unVehiculo;
    }

    public void setUnVehiculo(Vehiculo unVehiculo) {
        this.unVehiculo = unVehiculo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
    
    
}
