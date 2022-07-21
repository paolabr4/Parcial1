import javax.swing.*;

public class punto7 {

    String password = "12345";
    String password1;

    public punto7() {
        password1 = JOptionPane.showInputDialog("Porfavor Ingrese su contraseña");

        if (password1.equalsIgnoreCase(password)) {
            JOptionPane.showMessageDialog(null, password);
        }

    }

    public static void main(String[] args) {
        new punto7();
        //Escribir un programa que almacene la cadena de caracteres
        // contraseña en una variable, pregunte al usuario por la
        //contraseña e imprima por pantalla si la contraseña introducida
        // por el usuario coincide con la guardada en la variable sin
        //tener en cuenta mayúsculas y minúsculas.
    }
}
