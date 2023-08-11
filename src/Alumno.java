import java.util.ArrayList;
import java.util.Date;

public class Alumno {
    public Alumno(int id,int edad, String nombre) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Alumno() {
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public ArrayList<Double> getCalificaciones() {
        return calificaciones;
    }
    public void setCalificaciones(ArrayList<Double> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void rellenar(Double Calificaciones){
        calificaciones.add(Calificaciones);
        System.out.println();
    }
        public void mostra(){
            for (int i = 0; i < calificaciones.size(); i++) {
                System.out.println("Notas : " + calificaciones.get(i));
            }
    }
    private  int id;
    private int edad;
    private String nombre;
    private ArrayList<Double> calificaciones = new ArrayList<Double>();
}
