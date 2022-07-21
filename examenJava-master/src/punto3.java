import javax.swing.*;

public class punto3 {
    int edad;

    public punto3() {
        edad = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido, Ingrese su edad"));

        if (edad < 4) {
            JOptionPane.showMessageDialog(null, "Puede ingresar gratis");
        }
        if (edad >= 4 && edad <= 18) {
            JOptionPane.showMessageDialog(null, "Debe pagar 5000");
        }
        if (edad > 18) {
            JOptionPane.showMessageDialog(null, "Debe pagar 10000");
        }


    }


    public static void main(String[] args) {
        new punto3();


        //. Escribir un programa para una empresa que tiene salas de
        // juegos para todas las edades y quiere calcular de forma
        // automática el precio que debe cobrar a sus clientes por entrar.
        // El programa debe preguntar al usuario la edad del cliente y
        //mostrar el precio de la entrada. Si el cliente es menor de 4 años
        // puede entrar gratis, si tiene entre 4 y 18 años debe pagar 5000
        // y si es mayor de 18 años, 10000
    }
}
