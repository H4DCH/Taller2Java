import java.util.ArrayList;

public class Reserva {
    public Reserva(int id,int idHotel,ArrayList<Hotel> hotel, Habitacion habitacion, Cliente cliente) {
        this.id=id;
        this.hotel = hotel;
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.idHotel = idHotel;
    }

    public Reserva() {
    }

    public void infoReservas(){
        System.out.println("Nombre Empresa : " +cliente.getNombreEmpresa());
        System.out.println("Id reserva :" +id);
        System.out.println("Nombre Hotel : "+ hotel.get(idHotel).getNombreHotel());
        System.out.println("Nombre Ocupante :" +cliente.getNombre());
        habitacion.verCliente(cliente.getNombre());
    }
    private  int id;
    private ArrayList<Hotel> hotel ;
    private  Habitacion habitacion;
    private Cliente cliente;
    private int idHotel;



}
