public class Cliente {
    public Cliente(int cedula, String nombre,String nombreEmpresa) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.nombreEmpresa = nombreEmpresa;

    }
    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    private int cedula;
    private String nombre;
    private String nombreEmpresa;

}
