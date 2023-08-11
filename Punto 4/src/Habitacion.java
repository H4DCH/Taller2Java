public class Habitacion {
    private String[] nHabitaciones;
    public Habitacion() {
        nHabitaciones = new String[11];
            for (int i = 0; i <= 10; i++) {
                nHabitaciones[i] = "Disponible";
            }
    }
    public boolean revisarHabitacion(int n){
        boolean resultado;
        if (!nHabitaciones[n].equals("Disponible")){
             resultado = false;
        } else  resultado = true;
        return resultado;
    }
    public void Ocupada(int n,String cliente){
        nHabitaciones[n] = cliente;
    }
    public void  getnHabitaciones() {
        for (int i=0;i<=10;i++){
            if (nHabitaciones[i].equals("Disponible")){
                System.out.println("A"+i);
            }
        }
    }
    public void verCliente(String nombre){
        for (int i=0;i<=10;i++){
            if (nHabitaciones[i].equals(nombre)){
                System.out.println("Habitacion #"+i);
            }
        }
    }
}