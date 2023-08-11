import javax.swing.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int opcion;
        int idHotel=0;
        int idReserva = 0;
        ArrayList<Hotel> hoteles = new ArrayList<Hotel>();
        Habitacion habitacion = new Habitacion();
        Hotel hotel = new Hotel("Hotel mil olas");
        Hotel hotel2 = new Hotel("Hotel Chicharito");
        Hotel hotel3 = new Hotel("Hotel Palmas");
        hoteles.add(hotel);
        hoteles.add(hotel2);
        hoteles.add(hotel3);
        Reserva reserva;
        ArrayList<Reserva> reservas = new ArrayList<Reserva>();
        boolean salir = false;
        while (!salir) {
             opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese alguna de las opciones\n" +
                    "1.Ver Hoteles Disponibles\n" +
                    "2.Seleccionar Hotel\n" +
                    "3.Salir\n"));
            switch (opcion) {
                case 1 -> {
                    System.out.println();
                    int i = 0;
                    for (Hotel h : hoteles) {
                        System.out.println("Id Hotel " + i + " Nombre: " + h.getNombreHotel());
                        i++;
                    }
                }
                case 2 -> {
                    idHotel = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Id del hotel en el que quiere reservar"));
                    while (!salir){
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese alguna de las opciones\n" +
                                "1.Mostrar Habitaciones Disponibles\n" +
                                "2.Realizar Reserva\n" +
                                "3.Mostrar Reservas\n" +
                                "4.Eliminar Reserva\n" +
                                "6.Salir"));
                        switch (opcion) {
                            case 1 -> {
                                System.out.println("____________________________________________________");
                                System.out.println();
                                System.out.println(hoteles.get(idHotel).getNombreHotel());
                                hotel.ListadoHabitaciones(habitacion);
                            }
                            case 2 -> {
                                System.out.println("_____________________________________________");
                                String nombreEmpresa = JOptionPane.showInputDialog("Ingrese la empresa que reserva");
                                int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del ocupante"));
                                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del ocupante");
                                Cliente cliente = new Cliente(cedula, nombre, nombreEmpresa);
                                int nHabitacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habitacion que desae reservas"));
                                while (!habitacion.revisarHabitacion(nHabitacion)) {
                                    JOptionPane.showMessageDialog(null, "Esta habitacion ya esta reservada");
                                    nHabitacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habitacion que desae reservas"));
                                }
                                habitacion.Ocupada(nHabitacion, cliente.getNombre());
                                reserva = new Reserva(idReserva, idHotel, hoteles, habitacion, cliente);
                                reservas.add(reserva);
                                idReserva++;
                            }
                            case 3 -> {
                                System.out.println();
                                for (Reserva r : reservas) {
                                    System.out.println("_______________________________________________");
                                    r.infoReservas();
                                }
                                System.out.println();
                            }
                            case 4 -> {
                                int nEliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Id de la reserva para eliminar"));
                                reservas.remove(nEliminar);
                            }
                            case 6 -> salir = true;
                            default -> JOptionPane.showMessageDialog(null, "Opcion Invalida");
                        }
                    }
                    salir = false;
                }
                case 3 -> salir = true;
                default -> JOptionPane.showMessageDialog(null, "La opcion es incorrecta");
                }
            }
        }
    }
