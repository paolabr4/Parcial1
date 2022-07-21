import javax.swing.*;

public class punto6 {
    String nombre;
    String letra1;
    String letras;

    public punto6() {
        nombre = JOptionPane.showInputDialog("Digite su nombre completo");

        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        String[] partes = nombre.split(" ");
        for (int i = 0; i < partes.length; i++) {
            System.out.print(partes[i].toUpperCase().charAt(0) + partes[i].substring(1, partes[i].length()) + " ");
        }

    }

    public static void main(String[] args) {
        new punto6();
        //Escribir un programa que pregunte el nombre completo del
        // usuario y después muestre por pantalla el nombre completo
        // del usuario tres veces, una con todas las letras minúsculas,
        // otra con todas las letras mayúsculas y otra solo con la
        //primera letra del nombre y de los apellidos en mayúscula.
        // El usuario puede introducir su nombre combinando mayúsculas
        // y minúsculas como quiera.
    }
}
