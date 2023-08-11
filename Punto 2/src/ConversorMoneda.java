import javax.print.attribute.standard.JobKOctets;
import javax.print.attribute.standard.NumberUp;
import javax.swing.*;
import java.text.DecimalFormat;

public class ConversorMoneda {

    public ConversorMoneda(double monedaConvertir) {
        this.monedaConvertir = monedaConvertir;
    }

    public void convertirPesoEuro() {
        double resultado = monedaConvertir*precioEuro;
        DecimalFormat formato = new DecimalFormat("0");
        String resultadoFormateado = formato.format(resultado);
        JOptionPane.showMessageDialog(null, "Є" + resultadoFormateado + " Euros" );
    }
    public void  convertirPesoDolar(){
        double resultado = monedaConvertir*precioDolar;
        DecimalFormat formato = new DecimalFormat("0");
        String resultadoFormateado = formato.format(resultado);
        JOptionPane.showMessageDialog(null,"$" + resultadoFormateado + " Dolares");
    }
    public  void convertirDolarPeso(){
        double resultado = monedaConvertir*precioPesoDollar;
        DecimalFormat formato = new DecimalFormat("0");
        String resultadoFormateado = formato.format(resultado);
        JOptionPane.showMessageDialog(null,"$" + resultadoFormateado + " Pesos");
    }
    public  void convertirEuroPeso(){
        double resultado = monedaConvertir*precioPesoEuro;
        DecimalFormat formato = new DecimalFormat("0");
        String resultadoFormateado = formato.format(resultado);
        JOptionPane.showMessageDialog(null,"$" + resultadoFormateado + " Pesos");
    }
    private  double monedaConvertir;
    private double precioEuro = 0.00023;
    private  double precioDolar = 0.00025;
    private  double precioPesoDollar = 4034.42;
    private  double precioPesoEuro = 4434.36;
}
