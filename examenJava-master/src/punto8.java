import javax.swing.*;

public class punto8 {
    public static void main(String[] args) {
        //Escribir un programa que pida al usuario un número entero
        // positivo y muestre por pantalla la cuenta atrás desde
        // ese número hasta cero separados por comas.
        int i;
        int cant = 1;
        int limite = Integer.parseInt(JOptionPane.showInputDialog("ingrese el número entero "));
        System.out.print(limite + ",");
        for (i = 1; i <= limite; i++) {
            int x = limite - i;
            if (x == 0) {
                System.out.print(x);
            } else {
                System.out.print(x + ",");
            }
        }


    }
}