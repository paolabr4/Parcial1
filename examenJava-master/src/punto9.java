import javax.swing.*;

public class punto9 {
    String palabra;

    public punto9() {
        palabra = JOptionPane.showInputDialog("Ingrese una palabra");
        for (int i = 0; i < 10; i++) {
            System.out.println(palabra);

        }

    }

    public static void main(String[] args) {
        new punto9();
        //Escribir un programa que pida al usuario una palabra y
        // la muestre por pantalla 10 veces.
    }

}
