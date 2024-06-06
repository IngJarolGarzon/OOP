
package caljarol;




import java.awt.HeadlessException;
import javax.swing.JOptionPane;

class Operaciones {
    
    public int dividir(int numero1, int numero2)  {
        return numero1 / numero2;
    }

    public int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }
}

public class CalJarol {
     int numero1;
     int numero2;
     Operaciones operaciones;

    public CalJarol() {
        this.operaciones = new Operaciones();
    }

    public void leer() { 
        pedirNumeros();
        dividir();
        pedirNumeros();
        sumar();
        pedirNumeros();
        restar();
        pedirNumeros();
        multiplicar();  
    }

    public void pedirNumeros() {
        boolean continuarEjecucion = true;
        do {
            try {
                String input1 = JOptionPane.showInputDialog("Ingrese numero 1 ");
                this.numero1 = Integer.parseInt(input1);
                String input2 = JOptionPane.showInputDialog("Ingrese numero 2 ");
                this.numero2 = Integer.parseInt(input2);
                continuarEjecucion = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ocurrió un error: Ingrese solo números enteros", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (continuarEjecucion);
    }

    public void dividir() {
        try {
            int resultado = operaciones.dividir(numero1, numero2);
            JOptionPane.showMessageDialog(null, "El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Error: No se puede dividir entre cero", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            JOptionPane.showMessageDialog(null, "Se revisó la división", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void sumar() {
        try {
            int resultado = operaciones.sumar(numero1, numero2);
            JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error: Ingrese solo números enteros", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            JOptionPane.showMessageDialog(null, "Se revisó la suma", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void restar() {
        try {
            int resultado = operaciones.restar(numero1, numero2);
            JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error: Ingrese solo números enteros", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            JOptionPane.showMessageDialog(null, "Se revisó la resta", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void multiplicar() {
        try {
            int resultado = operaciones.multiplicar(numero1, numero2);
            JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error: Ingrese solo números enteros", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            JOptionPane.showMessageDialog(null, "Se revisó la multiplicación", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
         CalJarol test = new  CalJarol();
        test.leer();
    }
}