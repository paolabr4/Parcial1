import javax.swing.*;

public class punto4 {
    public static void main(String[] args) {
        //Escribir un programa que pregunte el nombre del
        // usuario  y un número entero e imprima
        // por pantalla en líneas distintas el nombre del usuario
        // tantas veces como el número introducido.
        String name;
        name = JOptionPane.showInputDialog("Ingrese el ombre del usuario");
        int limite = Integer.parseInt(JOptionPane.showInputDialog("ingresa cuantas lineas deseas imprimir"));
        for (int i = 0; i < limite; i++) {
            System.out.println(name);
        }
    }
}
