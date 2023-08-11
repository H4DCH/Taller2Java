import javax.swing.*;
public class Main {
    public static void main(String[] args) {
    boolean salir = false;
    SistemaAlumno sistema = new SistemaAlumno();
    Alumno alumno = new Alumno();
    double suma= 0.0;
    int id = 0;
   while (!salir) {
      int Opcion = Integer.parseInt(JOptionPane.showInputDialog("Eliga una opcion a realizar: \n" +
       "1.Agregar nuevo alumno y asignar calificaciones \n" + "2.Listar alumnos\n"+"0.Salir\n"));
                switch (Opcion) {
                    case  1 :
                        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
                        String Nombre = JOptionPane.showInputDialog("Ingrese el nombre completo");
                        alumno = new Alumno(id,edad, Nombre);
                        sistema.agregarAlumno(alumno);
                        suma = 0.0;
                        int Ncalificaciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de calificaciones para este Alumno"));
                        for (int i =1;i<=Ncalificaciones;i++){
                            double asigCalificaciones;
                            do {
                                asigCalificaciones = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación " + i));
                                if (asigCalificaciones < 0.0 || asigCalificaciones > 50.0) {
                                    JOptionPane.showMessageDialog(null, "La nota debe estar entre 0 y 50");
                                }
                            } while (asigCalificaciones < 0.0 || asigCalificaciones > 50.0);
                            suma += asigCalificaciones;
                            id++;
                            }
                        JOptionPane.showMessageDialog(null,"El promedio de " + Nombre + "es " + suma/Ncalificaciones);
                        if (suma/Ncalificaciones<30.0){
                            JOptionPane.showMessageDialog(null,Nombre + "Pierde el semestre");
                        }else JOptionPane.showMessageDialog(null,Nombre + "Gana el semestre");
                    break;
                    case 2 :
                         sistema.listar();
                         break;
                     default:JOptionPane.showMessageDialog(null,"Opcion invalida");
                         salir=true;
                    break;
                }
        }
    }
}