package interface2;

import javax.swing.JOptionPane;

public class Interfaze2 {

    public static void main(String[] args) {
    String firstNumber;
    String secondNumber;
    int number1;
    int number2;
    int sum;
    
    firstNumber = 
        JOptionPane.showInputDialog( "Ingrese el primer numero" );
    secondNumber=
        JOptionPane.showInputDialog( "ingrese el segundo numero" );
    
    number1 = Integer.parseInt( firstNumber ); 
    number2 = Integer.parseInt( secondNumber );
    
    sum = number1 + number2;
    
    JOptionPane.showMessageDialog( null, "El Resultado de la suma es " + sum , "Results",
    JOptionPane.PLAIN_MESSAGE ); 
    }
    
}
