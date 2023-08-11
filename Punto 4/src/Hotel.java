import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;
public class Hotel{
    private String nombreHotel;
    public Hotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }
    public void ListadoHabitaciones(Habitacion habitacion){
        habitacion.getnHabitaciones();
        }
    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

}
