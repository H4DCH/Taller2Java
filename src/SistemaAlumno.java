import java.util.*;

public class SistemaAlumno  {
    private ArrayList<Alumno> listaAlumnos;
    public SistemaAlumno()
    {
        listaAlumnos = new ArrayList<>();
    }
    public void agregarAlumno(Alumno alumno){
        listaAlumnos.add(alumno);
    }
    public void listar(){
        for (Alumno n: listaAlumnos) {
            System.out.println("Id del alumno :" + n.getId());
            System.out.println("Nombre del Alumno : " + n.getNombre());
            n.mostra();
        }
    }
    public void Promedio(int suma){

    }
}



