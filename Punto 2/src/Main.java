import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion: \n" +
                    "1.Convertir Pesos Colombianos a Euros\n" +
                    "2.Convertir Pesos Colombianos a Dolares Americanos\n" +
                    "3.Convertir Euros a Pesos Colombiano\n" +
                    "4.Convertir Dolares Americanos a Pesos Colombianos\n" +
                    "0.Salir"));
            switch (opcion) {
                case 1:
                    double pesoColombia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en pesos a convertir"));
                    ConversorMoneda conversorMoneda = new ConversorMoneda(pesoColombia);
                     conversorMoneda.convertirPesoEuro();
                    break;
                case 2:
                    double pesoColombia2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en pesos a convertir"));
                    ConversorMoneda conversorMoneda2 = new ConversorMoneda(pesoColombia2);
                    conversorMoneda2.convertirPesoDolar();
                    break;
                case 3:
                    double euro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en euros a convertir"));
                    ConversorMoneda conversorMoneda3 = new ConversorMoneda(euro);
                    conversorMoneda3.convertirEuroPeso();
                    break;
                case 4:
                    double dolar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en dolares a convertir"));
                    ConversorMoneda conversorMoneda4 = new ConversorMoneda(dolar);
                    conversorMoneda4.convertirDolarPeso();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion invalida");
                    break;
            }
        }
    }
}