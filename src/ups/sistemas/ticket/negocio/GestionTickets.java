package ups.sistemas.ticket.negocio;

import java.util.Calendar;
import java.util.GregorianCalendar;
import ups.sistemas.ticket.datos.TicketDao;
import ups.sistemas.ticket.datos.VehiculoDao;

/**
 *
 * @author fernandocuscomejia
 */



public class GestionTickets {
    public int numeroTicketNext(){
        TicketDao td = new TicketDao();
        return td.ultimoNumero();
    }
    
    public String obtenerHoraActual(){
        Calendar calendario = new GregorianCalendar();
        return calendario.get(Calendar.HOUR_OF_DAY)+":"+calendario.get(Calendar.MINUTE)+":"+calendario.get(Calendar.SECOND);
    }
    
    public Vehiculo buscarVehiculo(String placa){
        Vehiculo v = new Vehiculo();
        VehiculoDao vd = new VehiculoDao();
        v.setPlaca(vd.buscarByPlaca(placa).getPlaca());
        v.setMarca(vd.buscarByPlaca(placa).getMarca());
        return v;
    }
    
    public boolean guardarVehiculo(Vehiculo v){
        boolean saved = false;
        VehiculoDao vd = new VehiculoDao();
        saved = vd.insert(v);
        return saved;
    }
    
    public boolean registrarTicket(Ticket t){
        TicketDao td = new TicketDao();
        boolean isRegister = false;
        Ticket tck = new Ticket();
        tck.setId(t.getId());
        tck.setUnVehiculo(t.getUnVehiculo());
        tck.setFecha(t.getFecha());
        tck.setHoraIngreso(t.getHoraIngreso());
        tck.setEstado(t.getEstado());
        isRegister = td.insert(tck);
        return isRegister;
    }
    
    public Vehiculo buscarIdVehiculo(String placa){
        VehiculoDao vd = new VehiculoDao();
        Vehiculo v = vd.buscarByPlaca(placa);
        return v;
    }
    
    public boolean isOpenTicket(int idVehiculo){
        TicketDao td = new TicketDao();
        return td.estadoTicketVehiculo(idVehiculo);
    }
    
    public Ticket buscarNumeroTicket(int numero){
        TicketDao td = new TicketDao();
        Ticket tck = td.buscarTicket(numero);
        return tck;
    }
    
    public boolean pagarTicket(Ticket t){
        TicketDao td = new TicketDao();
        return td.pagarValorTicket(t);
    }
    
    public int calcularTiempo(String i, String f) {
        String horasInicio[] = i.split(":");
        String horaInicio = horasInicio[0];
        String minutosInicio = horasInicio[1];
        
        String horasFin[] = f.split(":");
        String horaFin = horasFin[0];
        String minutosFin = horasFin[1];
        
        if (horaInicio.charAt(0) == '0') {
            horaInicio = String.valueOf(horaInicio.charAt(1));
        }
        if (minutosInicio.charAt(0) == '0') {
            minutosInicio = String.valueOf(minutosInicio.charAt(1));
        }
        
        if(horaFin.charAt(0) == '0'){
            horaFin = String.valueOf(horaFin.charAt(1));
        }
        if(minutosFin.charAt(0) == '0'){
            minutosFin = String.valueOf(minutosFin.charAt(1));
        }
        int him = Integer.parseInt(horaInicio)*60;
        int mi = Integer.parseInt(minutosInicio);
        int minutosTotalesInicio = him + mi;
        
        int hfm = Integer.parseInt(horaFin)*60;
        int mf = Integer.parseInt(minutosFin);
        int minutosTotalesFin = hfm + mf;
        
        int totalMinutos = minutosTotalesFin - minutosTotalesInicio;
        return totalMinutos;
    }
    
    public double calcularValor(int minutos){
        return minutos / 60;
    } 
}