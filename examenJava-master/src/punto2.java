import javax.swing.*;

public class punto2 {
    public static void main(String[] args) {
        //Escribir un programa que pida al usuario un
        // número entero y muestre por pantalla un
        //triángulo rectángulo como el de más abajo.
        //
        // 1
        // 3 1
        // 5 3 1
        // 7 5 3 1


        int cant = 1;
        int limite = Integer.parseInt(JOptionPane.showInputDialog("ingresa cuantas lineas deseas imprimir"));
        while (cant <= limite) {
            for (int j = cant; j >= 1; j--) {
                int x = 2 * j - 1;
                System.out.print(x);
            }

            System.out.println(" ");
            cant = cant + 1;
        }


    }
}