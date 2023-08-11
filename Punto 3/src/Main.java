import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primero numero"));
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la operacion a realizar\n" +
                    "1.Suma\n"+
                    "2.Resta\n" +
                    "3.Multipliacion\n" +
                    "4.Division\n"+
                    "5.Salir"));
            switch (opcion) {
                case 1:
                    Main suma = new Main();
                    System.out.println("El resultado de la suma es : " + suma.suma(numero1, numero2));
                    break;
                case 2:
                    Main resta = new Main();
                    System.out.println("El resultado de la resta es : " + resta.resta(numero1, numero2));
                    break;
                case 3:
                    Main mult = new Main();
                    System.out.println("El resultado de la multipliacion es : " + mult.multiplicacion(numero1, numero2));
                    break;
                case 4:
                    Main division = new Main();
                    System.out.println("El resultado de la division es : " + division.division(numero1, numero2));
                    break;
                case 5:
                    salir = true;
                    break;
            }

        }
    }

    public int suma(int n1,int n2){
        return  n1+n2;
    }

    public int resta(int n1,int n2){
        return  n1-n2;
    }

    public int multiplicacion(int n1,int n2){
        return  n1+n2;
    }

    public int division(int n1,int n2){
        return  n1/n2;
    }

}